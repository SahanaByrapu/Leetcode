# Write your MySQL query statement below
select query_name, ROUND(AVG(rating/position),2) as quality, 
ROUND(SUM(IF(rating<3, 100,0))/COUNT(*),2) as poor_query_percentage
from  Queries 
where query_name is NOT NULL
group by query_name


