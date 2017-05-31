create or replace 
TRIGGER TR_CUSTOMER
BEFORE INSERT OR UPDATE
ON CUSTOMER
REFERENCING NEW as newROW OLD as oldROD
FOR EACH ROW
DeCLARE
BEGIN
  IF(:newROW.CREDIT < 0) THEN
    raise_application_error(-20001, 'Credit darf nicht kleiner 0 sein');
  END IF;
  
  IF (UPDATING) THEN
    IF(:newROW.CREDIT < 0) THEN
    raise_application_error(-20002, 'Credit darf nicht kleiner 0 sein');
    END IF;
  END IF;
  

END TR_CUSTOMER;