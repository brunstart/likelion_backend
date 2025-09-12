create table books(
                      isbn varchar(20) not null primary key,
                      title varchar(255) not null,
                      author varchar(50) not null,
                      price int not null default 0 check (price >= 0),
                      publication_date date not null,
                      created_at timestamp default current_timestamp
)engine=InnoDB default charset=utf8mb4;
-- MySQL은 엔진이 여러개 있음, 버전 5 이상은 기본으로 InnoDB

insert into books (isbn, title, author, price, publication_date)
values ('123-11', '즐거운자바', '강경미', 25000, '2015-05-05');

insert into books
values('123-22', '즐거운database', 'kang', 30000, '2024-01-29', default);

select *
from books;

-- 수정, 삭제
-- UPDATE 테이블명 SET 컬럼명 = '수정할 값', 컬럼명 = '수정할 값' WHERE 조건
-- DELETE FROM 테이블명 WHERE 조건
-- WHERE절 없으면 모든 데이터

UPDATE books SET title = '즐거운 SQL' WHERE isbn = '123-22';
UPDATE books SET isbn = '123-123' WHERE isbn = '123-22';
UPDATE books SET author = 'park', publication_date = '2025-09-12', price = 35000 WHERE isbn = '123-123';

DELETE FROM books WHERE isbn = '123-11';

-- 인덱스
-- 데이터 검색속도를 향상시키기 위한 자료구조
-- 인덱스로 사용하기 좋은 컬럼의 조건
-- 조회 조건에 자주 쓰이는 컬럼
-- 값의 분포도가 넓은 컬럼

CREATE INDEX books_author_idx
    on books(author);

show index from books;
alter table books
drop index books_author_idx;

explain select * from books where author='강경미';

-- on delete cascade : foreign key에 붙이는데 연결된 거 삭제되면 같이 삭제되도록 설정
-- 트랜잭션 : DB에서 하나의 작업으로 처리되는 논리적 작업 단위, 나눌 수 없는 작업 단위
-- 입력 수정 삭제가 시작되면 트랜잭션 시작, 적용하려면 commit, 되돌리려면 rollback

select @@autocommit;
set autocommit = 1;

desc a;

select * from a;

-- autocommit을 꺼두고 bash에서 데이터 삽입을 하면 워크벤치에서 select를 해도 해당 데이터를 확인할 수 없음 (다른 클라이언트는 확인이 불가)
-- 각 세션마다 접속 경로가 다름. commit을 안하면 정보 수정한게 적용이 안돼서 다른 클라이언트는 확인이 안됨
-- commit : 데이터 삽입, 수정, 삭제등을 실제 적용하는것
-- rollback : 데이터 삽입, 수정, 삭제한것을 되돌리는것

update books set price = 50000 where isbn = '123-123';

-- ACID 특성 중 I (Isolation) 독립성에 해당
-- 데이터 수정을 하고 commit을 하지 않은 상태에서 다른 세션이 해당 데이터를 또 수정하려고 하면 락이 걸려버림, 접근이 불가
-- 먼저 수정한 세션에서 commit을 해야 다른 세션에서 수정이 가능함

-- 데드락(교착상태) : 서로 트랜잭션 처리를 기다려야해서 아무것도 못하는 상태

-- AutoCommit 확인
SELECT @@AUTOCOMMIT;

-- AutoCommit 해제
SET AUTOCOMMIT = 0;

-- 트랜잭션 시작
START TRANSACTION;

-- SQL 실행
INSERT INTO user (email, name, password)
VALUES ('test@test.com', '테스트', '1234');

-- 커밋 또는 롤백
COMMIT;     -- 변경사항 확정
ROLLBACK;   -- 변경사항 취소

-- AutoCommit 설정
SET AUTOCOMMIT = 1;

-- 트랜잭션 개념
alter table a
    add column updated_date timestamp null;

select * from a;

desc dept;

insert into dept(deptno, dname, loc) values(5, 'like', 'Seoul');

select * from dept;

commit;