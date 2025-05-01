WITH LAT_N_BY_ROW AS (
    SELECT LAT_N,
           ROW_NUMBER() OVER (ORDER BY LAT_N) AS RN
      FROM STATION
),
MAX_ROW AS (
    SELECT MAX(RN) AS MAXIMUM FROM LAT_N_BY_ROW
)
SELECT ROUND(
        CASE WHEN MAX_ROW.MAXIMUM % 2 = 1 THEN
                 (SELECT LAT_N
                    FROM LAT_N_BY_ROW
                   WHERE RN = (MAXIMUM + 1) / 2)
             ELSE
                (SELECT AVG(LAT_N)
                   FROM LAT_N_BY_ROW
                  WHERE RN IN (MAXIMUM / 2, (MAXIMUM / 2) + 1))
        END, 4)
  FROM MAX_ROW;