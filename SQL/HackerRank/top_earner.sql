/*
Enter your query here.
*/
SELECT months * salary, COUNT(*) 
FROM Employee 
GROUP BY months * salary 
ORDER BY months * salary DESC 
LIMIT 1;
