create or replace PROCEDURE MonthlyInterestCalculator is
begin 
    update ACCOUNTS
    set BALANCE=BALANCE+(balance*0.01),
    lastModified=sysdate
    where upper(ACCOUNTTYPE) = 'SAVINGS';
    dbms_output.PUT_LINE('Monthly interest applied to all savings accounts.');

EXCEPTION 
    when others THEN 
        DBMS_OUTPUT.PUT_LINE('Error Occured.');
end;
/

-- Execute the procedure to apply monthly interest to savings accounts
BEGIN
    MonthlyInterestCalculator;
END;
/
