create or replace procedure UpdateEmployeeBonus(
    dept in varchar2,
    bonus in NUMBER
) is
begin
    update EMPLOYEES
    set 
        salary = salary+(salary*bonus/100)
    where upper(department)=upper(dept);
end;
/

begin
     UpdateEmployeeBonus('hr', 10);
end;