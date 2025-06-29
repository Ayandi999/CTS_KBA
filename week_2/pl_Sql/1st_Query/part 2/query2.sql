alter table customers
add isVIP varchar2(5);

DECLARE
    cust_balance NUMBER;
    CURSOR custInfo IS 
        SELECT balance, customerid, isVip FROM customers;
BEGIN   
    FOR i IN custInfo LOOP
        IF i.balance >= 10000 THEN 
            UPDATE customers 
            SET isVip = 'TRUE' 
            WHERE customerid = i.customerid;
        ELSE 
            UPDATE customers 
            SET isVip = 'FALSE'
            WHERE customerid = i.customerid;
        END IF;
    END LOOP;
END;
/
