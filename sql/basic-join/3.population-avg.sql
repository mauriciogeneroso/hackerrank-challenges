SELECT COUNTRY.CONTINENT,
       FLOOR(AVG(CITY.POPULATION))
  FROM CITY AS CITY INNER JOIN COUNTRY AS COUNTRY
    ON CITY.COUNTRYCODE = COUNTRY.CODE
 GROUP BY COUNTRY.CONTINENT;