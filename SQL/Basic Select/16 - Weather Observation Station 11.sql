--     Author: Carlos Reis
--     Github: github.com/CarlosEReis
-- HackerRank: hackerrank.com/carlos_er7

SELECT DISTINCT CITY FROM STATION
  WHERE CITY REGEXP '^[^aeiou]|[^aeiou]$';
