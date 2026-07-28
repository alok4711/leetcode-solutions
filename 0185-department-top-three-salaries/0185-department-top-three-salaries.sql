# Write your MySQL query statement below
select d.name as Department, e.name as Employee, e.salary as Salary
from Employee e join Department d
on e.departmentId =d.id
where e.salary > ifnull((
    select distinct e1.salary
    from Employee e1
    where e.departmentId = e1.departmentId
    order by e1.salary desc
    limit 3, 1), -1);