# Write your MySQL query statement below
select t.request_at as Day,
round(SUM(t.Status != 'completed')/count(*), 2) AS "Cancellation Rate"
from Trips t
join Users c
on t.client_id=c.users_id
join Users d
on t.driver_id=d.users_id
where c.banned='No'
and d.banned='No'
and t.Request_at between '2013-10-01' and '2013-10-03'
group by t.request_at;