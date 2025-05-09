DELIMITER $$

CREATE PROCEDURE PRIME_NUMBER(IN MAXIMUM INT)
BEGIN
    DECLARE CURRENT_NUMBER INT DEFAULT 2;
    DECLARE I INT;
    DECLARE IS_PRIME BOOLEAN;
    DECLARE RESULT TEXT DEFAULT '';

    WHILE CURRENT_NUMBER <= MAXIMUM DO
        SET IS_PRIME = TRUE;
        SET I = 2;

        check_loop: WHILE I <= SQRT(CURRENT_NUMBER) DO
            IF CURRENT_NUMBER % I = 0 THEN
                SET IS_PRIME = FALSE;
                LEAVE check_loop;
            END IF;
            SET I = I + 1;
        END WHILE check_loop;

        IF IS_PRIME THEN
            SET RESULT = CONCAT(RESULT, CURRENT_NUMBER, '&');
        END IF;

        SET CURRENT_NUMBER = CURRENT_NUMBER + 1;
    END WHILE;

    IF CHAR_LENGTH(RESULT) > 0 THEN
        SELECT LEFT(RESULT, CHAR_LENGTH(RESULT) - 1) AS PrimeNumbers;
    ELSE
        SELECT '' AS PrimeNumbers;
    END IF;
END$$

DELIMITER ;


CALL PRIME_NUMBER(1000);
