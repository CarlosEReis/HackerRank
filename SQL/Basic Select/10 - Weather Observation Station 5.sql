--     Author: Carlos Reis
--     Github: github.com/CarlosEReis
-- HackerRank: hackerrank.com/carlos_er7

SELECT CITY, LENGTH(CITY) FROM STATION ORDER BY LENGTH(CITY), CITY LIMIT 1;
SELECT CITY, LENGTH(CITY) FROM STATION ORDER BY LENGTH(CITY) DESC, CITY LIMIT 1;
