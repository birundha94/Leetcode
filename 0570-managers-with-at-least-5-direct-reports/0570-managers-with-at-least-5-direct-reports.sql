# Write your MySQL query statement below
select e.name
from Employee e
join Employee e1
on e.id=e1.managerid 
group by e1.managerid
having count(*)>=5;
