
-- 모든 직원의 이름과 이메일을 조회
select first_name, last_name, email
from employees;

-- 급여가 15,000 이상인 직원 조회
select *
from employees
where salary >= 15000;

-- 2005년에 입사한 직원을 조회
select *
from employees
where hire_date like '2005%';


-- 이름에 'an'이 포함된 직원을 찾으세요
select *
from employees
where first_name like '%an%' or last_name like '%an%';

-- 이메일이 'S'로 시작하는 직원을 급여 내림차순으로 정리하세요.
select email, salary
from employees
where email like 'S%'
order by salary desc;

-- 각 부서별 직원 수와 평균 급여를 구하세요
select department_id, count(*), avg(salary)
from employees
group by department_id;

-- 직원이 5명 이상인 부서만 조회하세요
select department_id, count(*), avg(salary)
from employees
group by department_id
having count(*) >= 5;

