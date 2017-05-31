CREATE OR REPLACE

TRIGGER TRG_CUSTOMER

BEFORE INSERT OR UPDATE

ON CUSTOMER

REFERENCING OLD as oldROW NEW as newROW

FOR EACH ROW

DECLARE

BEGIN



  IF (:newROW.CREDIT < :oldROW.CREDIT) THEN

  raise_application_error (-1001, 'Credit darf nicht kleiner 0 sein');

  END IF;

  

  IF (UPDATING) THEN

    IF (neueRow.CREDIT < 0) THEN

      raise_application_error (2001, 'Credit darf nicht kleiner 0 sein');

    END IF;

  END IF;



END TRG_CUSTOMER;