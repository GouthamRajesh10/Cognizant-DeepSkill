--Scenerio 1
CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
    UPDATE Accounts
    SET Balance = Balance + Balance*0.01
    WHERE AccountType='Savings';
END;
/
COMMIT;
EXECUTE ProcessMonthlyInterest;
SELECT * FROM Accounts;

--Scenerio2
CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
    p_department Employees.department%Type,
    p_bonus Employees.salary%Type) IS
    BEGIN
        UPDATE Employees
        SET Salary = Salary + p_bonus
        WHERE Department = p_department;
    END;
    /
    COMMIT;
EXECUTE UpdateEmployeeBonus('Finance', 5000);
SELECT * FROM Employees;


--Scenerio3
CREATE OR REPLACE PROCEDURE TransferFunds(
    p_from_accnt Accounts.AccountID%Type,
    p_to_accnt Accounts.AccountID%Type,
    p_amount Accounts.Balance%Type) IS
    BEGIN
        DECLARE
            v_balance Accounts.Balance%Type;
        BEGIN
            SELECT Balance INTO v_balance FROM Accounts WHERE AccountID = p_from_accnt;
            IF v_balance < p_amount THEN
                DBMS_OUTPUT.PUT_LINE('insufficient balance');
            ELSE
                UPDATE Accounts
                SET Balance = Balance - p_amount
                WHERE AccountID = p_from_accnt;

                UPDATE Accounts
                SET Balance = Balance + p_amount
                WHERE AccountID = p_to_accnt;
                END IF;
        END;
    END;
    /
    COMMIT;
EXECUTE TransferFunds(101, 102, 500);
SELECT * FROM Accounts;




