# Write your MySQL query statem(ent below

select SUBSTR(trans_date,1,7) as month, country, COUNT(*) as trans_count,
SUM(CASE WHEN state='approved'then 1 else 0 END) as approved_count,
SUM(amount) as trans_total_amount,
SUM(CASE WHEN state='approved' then amount else 0 END) as approved_total_amount 
from Transactions
group by month,country

