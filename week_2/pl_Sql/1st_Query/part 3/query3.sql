declare
    timeleft NUMBER;
    cursor custinfo is
        select customerid,enddate from loans;
BEGIN
    for i in custinfo LOOP
    timeleft := i.enddate-sysdate;
    
    if timeleft <= 30 then
        dbms_output.put_line('The loan is due in the next 30 days customer with id:'||i.customerid);
    end if; 
    end loop;
end;
/


