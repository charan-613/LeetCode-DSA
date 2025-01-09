# Write your MySQL query statement below
SELECT E1.name AS Employee FROM Employee E1
INNER JOIN EMPLOYEE E2
ON E1.managerID = E2.id
WHERE E1.salary > E2.salary