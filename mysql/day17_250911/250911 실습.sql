desc emp;
show tables;
desc salgrade;
select * from salgrade;	-- 기준을 가지고 있는 테이블을 쓰는 경우가 있음
						-- 직접적으로 관계를 갖고 있는것은 아니나 salary에 대한 기준을 가지고 있음
                        
-- Non-Equi Join (Theta Join)
select e.ename, e.sal, s.grade
from emp e, salgrade s
where e.sal between s.min_salary and s.max_salary;

select e.ename, e.deptno, d.dname
from emp e, dept d
where e.deptno = d.deptno;

select e.ename, e.deptno, d.dname
from emp e right outer join dept d
using(deptno);

insert into emp values( 
1000, 'kang', 'PRESIDENT', null, STR_TO_DATE ('17-11-1981','%d-%m-%Y'), 10000, null, null);
delete from emp where empno = 1000;
commit;

-- 내가 더 보고자 하는 테이블을 기준으로 작성 (왼쪽의 정보를 더 보겠다 = deptno가 없어도 조회됨)
select e.ename, e.deptno, d.dname
from emp e left outer join dept d
using(deptno);

-- MySql은 full outer join이 안됨, 다 보려면 union 연산자를 사용해야함
select e.ename, e.deptno, d.dname
from emp e right outer join dept d
using(deptno)
union
select e.ename, e.deptno, d.dname
from emp e left outer join dept d
using(deptno);
select *
from emp;

-- SELF JOIN (자기 자신과 조인)
select
	e.empno 사원번호,
    e.ename 사원이름,
    m.empno 매니저사번,
    m.ename 매니저이름
from emp e, emp m
where e.mgr = m.empno;

select
	e.empno 사번,
    e.ename 사원명,
    m.empno 매니저번호,
    m.ename 매니저명
from emp e
left join emp m on e.mgr = m.empno;
    
-- sub query (서브 쿼리)
-- 한번의 쿼리로 결과를 얻을 수 없을 때가 있다.
-- smith라는 사람이 속한 부서의 평균 급여를 알고싶다.

select deptno
from emp
where ename = 'smith';

select avg(sal)
from emp
where deptno = 20;

select avg(sal)
from emp
where deptno = (select deptno
				from emp
				where ename = 'smith');
                
-- single row sub query (서브쿼리의 결과가 한 행인 경우)
select ename, sal
from emp
where sal < (
				select avg(sal)
                from emp
			);

select ename, hiredate
from emp
where hiredate = (
					select min(hiredate)
					from emp
				 );
                 
-- 부서이름이 SALES인 사원의 정보를 출력하세요
select *
from emp
where deptno = (select deptno
				from dept
				where dname = 'SALES'
                );
                
-- test는 가장 작은 단위부터 해봐야함
select deptno from dept where dname = 'SALES';

-- 서브쿼리의 결과가 여러개가 나오는 경우 (multi-row subquery)

-- 부서별 평균 급여
select avg(sal), deptno
from emp
group by deptno;

-- 급여가 부서별 평균급여보다 적은 사람
select *
from emp
where sal < (
			select avg(sal)
			from emp
			group by deptno
			);

-- 서브쿼리의 결과값이 여러개 이므로, =, >, <, >=, <=, <> 이런 연산자로 수행이 안됨
-- in, any, all 사용
-- in = or 의 결합. sal = 첫번째row or sal = 두번째row or ...
-- in : 같은지를 비교함
select ename, sal
from emp
where sal in (
			select max(sal)
			from emp
			group by deptno
			);

-- any는 다 올 수 있음 =, >, <, >=, <=, <>
-- =any, >any, >=any, <=any, <any, <>any
-- =any 는 in 과 동일

-- any ( =, >, <, >=, <=, <>) + or 결합 : sal > any (1000,2000,3000) --> sal > 1000 or sal > 2000 or sal > 3000
-- all ( =, >, <, >=, <=, <>) + and 결합 : sal > all (1000,2000,3000) --> sal > 1000 and sal > 2000 and sal > 3000

select ename, sal
from emp
where sal > any (
			select sal
			from emp
			where deptno = 30
			);
            
-- 상관 서브쿼리 개념
-- 자기 부서 평균 급여보다 많이 받는 사람 조회
select o.ename, o.sal, o.deptno
from emp o
where o.sal > (
				select avg(i.sal)
                from emp i
                where i.deptno = o.deptno
                );
                
-- 다중 컬럼 서브쿼리
-- 각 부서별 최고 급여를 받는 사원
select deptno, empno, ename, sal
from emp
where (deptno, sal) in (
	select deptno, max(sal)
    from emp
    group by deptno
);

select e.deptno, e.empno, e.ename, e.sal
from emp e
join (select deptno, max(sal) max_sal from emp group by deptno) m
on e.deptno = m.deptno and e.sal = m.max_sal;

select deptno, max(sal) max_sal from emp group by deptno;

-- exists 연산자
-- 부하직원이 있는 직원만 조회
SELECT e.empno, e.ename
FROM emp e
WHERE EXISTS (
    SELECT 1
    FROM emp s
    WHERE s.mgr = e.empno
);

-- 부하직원이 없는 직원
SELECT e.empno, e.ename
FROM emp e
WHERE NOT EXISTS (
    SELECT 1
    FROM emp s
    WHERE s.mgr = e.empno
);

select * from emp;

select 1 from emp s where s.mgr = 7839; -- select 1은 그냥 조건에 맞으면 1 출력함

-- 테스트용 테이블
CREATE TABLE A (name INT);
CREATE TABLE B (name INT);

INSERT INTO A VALUES (1), (2), (3);
INSERT INTO B VALUES (2), (3), (4);

insert into a values (now());
insert into a values ('a');

select * from A;
select * from B;

-- 중복 제거 합집합
SELECT name FROM A
UNION
SELECT name FROM B;
-- 결과: 1, 2, 3, 4

-- 중복 포함 합집합
SELECT name FROM A
UNION ALL
SELECT name FROM B;
-- 결과: 1, 2, 3, 2, 3, 4

-- 교집합 (MySQL은 직접 지원 안함, join으로 구현)
-- INTERSECT 대체
SELECT DISTINCT A.name 
FROM A 
INNER JOIN B ON A.name = B.name;
-- 결과: 2, 3

-- 차집합 (MySQL 직접지원안함, 서브쿼리로 구현)
-- MINUS 대체
SELECT name FROM A
WHERE name NOT IN (
    SELECT name FROM B
);
-- 결과: 1

-- 윈도우 함수
-- rank()
-- 급여 순위 매기기
SELECT 
    sal,
    ename,
    RANK() OVER(ORDER BY sal DESC) AS ranking
FROM emp;

-- 부서별 급여 순위
SELECT 
    deptno,
    ename,
    sal,
    RANK() OVER(PARTITION BY deptno ORDER BY sal DESC) AS dept_rank
FROM emp;

-- row_number()
-- 행 번호 부여
SELECT 
    ROW_NUMBER() OVER(ORDER BY sal DESC) AS row_num,
    ename,
    sal
FROM emp;

-- dense_rank()
-- 동일 순위 다음 순위 건너뛰지 않음
SELECT 
    sal,
    ename,
    DENSE_RANK() OVER(ORDER BY sal DESC) AS dense_ranking
FROM emp;

select * from emp;
select * from dept;

-- JOIN 연습
select e.ename, d.dname
from emp e, dept d
where e.deptno = d.deptno;

select o.*
from emp o
where o.sal > (select avg(sal)
				from emp i
				where o.deptno = i.deptno);
                
select o.*
from emp o
where o.sal = (
				select max(sal)
				from emp i
                where o.deptno = i.deptno
			  );
              
-- MySQL 데이터 타입
-- 숫자형 : INT, BIGINT, DECIMAL/ 정수, 실수
-- 문자형 : VARCHAR, CHAR, TEXT / 문자열
-- 날짜형 : DATE, TIME, DATETIME, TIMESTAMP / 날짜와 시간
-- 기타 : JSON, BLOB / JSON 데이터, 바이너리

-- 숫자형
/*
INT             -- -2,147,483,648 ~ 2,147,483,647
BIGINT          -- 더 큰 정수
DECIMAL(8,2)    -- 전체 8자리, 소수점 2자리

-- 문자형
VARCHAR(255)    -- 가변 길이 (최대 255)
CHAR(10)        -- 고정 길이 (정확히 10)
TEXT            -- 긴 텍스트

-- 날짜형
DATE            -- 'YYYY-MM-DD'
DATETIME        -- 'YYYY-MM-DD HH:MM:SS'
TIMESTAMP       -- 자동 시간 기록
*/

-- 테이블 생성
CREATE TABLE students(
	id int primary key auto_increment, -- 기본키 (반드시 설정해야함)
    name varchar(50) not null, -- not null : null 허용 안함
    age int check(age >= 1 and age <= 120), -- check : 값의 범위를 정해줄 수 있음
    email varchar(100) unique, -- unique : 중복 허용 안함
    created_date datetime default current_timestamp
);

-- check 조건을 쓸 경우 정해진 값만 쓸 수 있다.

select job from emp;
desc emp;
desc students;

-- products (id, name, price, reg_date)

create table products(
	id int primary key auto_increment,
    name varchar(30) not null,
    price int,
    reg_date datetime
);

desc products;

-- 데이터 삽입
-- insert into 테이블 명(컬럼명...) values (값...); 앞에 나열된 컬럼명 순서대로 값이 나열되어야 함.
-- insert into 테이블 명 values (값...); 컬럼명 생략되면, desc 테이블명; 해서 나온 순서대로 모든 값이 나열 되어야 함.

insert into products (name, price) values ('pen', 3000);

select * from products;

insert into products (price) values (3000); -- name이 not null이라서 비우면 오류남

insert into products value (null, 'pen', 4000, null);

insert into students(name, age, email) values ('kang', 10, 'kang@naver.com');
insert into students(name, age, email) values ('kim', 130, 'kim@naver.com'); -- age의 check 조건에 맞지 않아서 오류남

select * from students;
