create PROCEDURE TransferFunds(
    TransferedFrom number,
    TransferedTo number,
    amount number
)
is
balance_amount number;
   begin
    select balance into balance_amount  from accounts where accountid=TransferedFrom;
    
    if balance_amount < amount then
        DBMS_OUTPUT.PUT_LINE('Insufficient balance, bro.');
        return;
    end if;
    
    update ACCOUNTS
        set
            balance=balance+amount
        where 
            accountid=TransferedTo;
    update ACCOUNTS
        set
            balance = balance - amount
        where 
            accountid=TransferedFrom;
    commit;
end;
/

begin
    TransferFunds(201, 202, 100);
end;