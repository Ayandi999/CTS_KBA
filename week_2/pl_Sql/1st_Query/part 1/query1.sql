declare
    custId NUmber;
    custAge number;
    custDOB date;
    cursor customerInfo IS
        select customerID,DOB from CUSTOMERS;
BEGIN
    for var in customerInfo loop
        custAge := floor(Months_between(sysdate,var.DOB)/12);
        if custAge >= 60 then
            update LOANS
            set INTERESTRATE = INTERESTRATE - 1
            where CUSTOMERID = var.customerID;
            dbms_output.PUT_LINE('applied discount of 1% to Customer with id:'||var.customerID);
        end if;
    end loop;
end;
/
