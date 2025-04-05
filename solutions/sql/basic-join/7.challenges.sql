SELECT H.HACKER_ID, 
       H.NAME,
       COUNT(1)
  FROM HACKERS H,
       CHALLENGES C
 WHERE H.HACKER_ID = C.HACKER_ID
 GROUP BY H.HACKER_ID, H.NAME
HAVING COUNT(1) NOT IN (SELECT DISTINCT COUNT(1)
                          FROM CHALLENGES 
                         WHERE HACKER_ID <> H.HACKER_ID
                         GROUP BY HACKER_ID
                        HAVING COUNT(1) < (SELECT MAX(AUX.QUANTITY)
                                             FROM (SELECT COUNT(1) AS QUANTITY
                                                     FROM CHALLENGES CH
                                                    GROUP BY CH.HACKER_ID) AS AUX))
 ORDER BY 3 DESC, 1;