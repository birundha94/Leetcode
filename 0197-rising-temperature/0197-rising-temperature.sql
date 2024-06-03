# Write your MySQL query statement below
select w1.id
from Weather w
join Weather w1
on Datediff(w.recordDate,w1.recordDate)=-1
and w1.temperature>w.temperature;

