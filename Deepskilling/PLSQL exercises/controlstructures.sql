--Scenerio 1
SELECT * FROM Loans;
BEGIN
    FOR cust_rec IN (SELECT CustomerID, DOB FROM Customers) LOOP
        IF FLOOR(MONTHS_BETWEEN(SYSDATE,cust_rec.DOB)/12)>60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 0.01
            WHERE CustomerID = cust_rec.CustomerID;
        END IF;
    END LOOP;
    COMMIT;
END;
/
SELECT * FROM Customers;
--Scenerio 2
ALTER TABLE Customers ADD Is_VIP NUMBER(1) DEFAULT 0;
BEGIN
    FOR cust_rec IN (SELECT CustomerID, Balance FROM Customers) LOOP
        IF cust_rec.Balance > 10000 THEN
            UPDATE Customers
            SET Is_VIP = 1
            WHERE CustomerID = cust_rec.CustomerID;
        END IF;
    END LOOP;
    COMMIT;
END;
/

--Scenerio 3
BEGIN
    FOR rec IN (SELECT c.CustomerID, c.Name, l.EndDate FROM Customers c JOIN Loans l 
    ON c.CustomerID = l.CustomerID WHERE l.EndDate BETWEEN SYSDATE AND SYSDATE + 30) LOOP
        DBMS_OUTPUT.PUT_LINE('Customer_ID:'||rec.CustomerID||' Name:'||rec.Name||'loan due reminder');
    END LOOP;
    COMMIT;
END;
/

