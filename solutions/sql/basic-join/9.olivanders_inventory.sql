SELECT W.ID,
       WP.AGE,
       W.COINS_NEEDED,
       W.POWER
 FROM WANDS AS W,
      WANDS_PROPERTY AS WP
WHERE W.CODE = WP.CODE
  AND WP.IS_EVIL = 0
  AND W.COINS_NEEDED = (SELECT MIN(W2.COINS_NEEDED)
                          FROM WANDS W2 JOIN WANDS_PROPERTY WP2 ON W2.CODE = WP2.CODE
                         WHERE WP2.IS_EVIL = 0
                           AND WP2.AGE = WP.AGE
                           AND W2.CODE = W.CODE
                           AND W2.POWER = W.POWER)
ORDER BY W.POWER DESC, WP.AGE DESC;