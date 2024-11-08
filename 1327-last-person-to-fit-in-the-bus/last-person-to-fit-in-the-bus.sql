# Write your MySQL query statement below
SELECT 
    person_name
FROM (
    SELECT turn,
        person_id,
        person_name,
        weight,
        SUM(weight) over(order by turn) as total_weight
        FROM Queue
) weight
WHERE totaL_weight <= 1000
ORDER BY total_weight DESC
LIMIT 1