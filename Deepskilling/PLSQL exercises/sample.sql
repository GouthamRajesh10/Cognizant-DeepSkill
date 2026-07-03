INSERT INTO Customers (CustomerID, Name, DOB, Balance, LastModified)
VALUES (1, 'John Doe', TO_DATE('1985-05-15', 'YYYY-MM-DD'), 1000, SYSDATE);

INSERT INTO Customers (CustomerID, Name, DOB, Balance, LastModified)
VALUES (2, 'Jane Smith', TO_DATE('1990-07-20', 'YYYY-MM-DD'), 1500, SYSDATE);


INSERT INTO Customers (CustomerID, Name, DOB, Balance, LastModified)
VALUES (3, 'Robert Klein', TO_DATE('1955-02-10', 'YYYY-MM-DD'), 2000, SYSDATE);

INSERT INTO Customers (CustomerID, Name, DOB, Balance, LastModified)
VALUES (4, 'Priya Nair', TO_DATE('1978-11-02', 'YYYY-MM-DD'), 15000, SYSDATE);

INSERT INTO Customers (CustomerID, Name, DOB, Balance, LastModified)
VALUES (5, 'Margaret Chu', TO_DATE('1950-09-30', 'YYYY-MM-DD'), 25000, SYSDATE);


INSERT INTO Loans (LoanID, CustomerID, LoanAmount, InterestRate, StartDate, EndDate)
VALUES (1, 1, 5000, 5, SYSDATE, ADD_MONTHS(SYSDATE, 60));


INSERT INTO Loans (LoanID, CustomerID, LoanAmount, InterestRate, StartDate, EndDate)
VALUES (2, 2, 8000, 6, ADD_MONTHS(SYSDATE, -12), SYSDATE + 15);


INSERT INTO Loans (LoanID, CustomerID, LoanAmount, InterestRate, StartDate, EndDate)
VALUES (3, 3, 10000, 7, ADD_MONTHS(SYSDATE, -6), ADD_MONTHS(SYSDATE, 54));

INSERT INTO Loans (LoanID, CustomerID, LoanAmount, InterestRate, StartDate, EndDate)
VALUES (4, 4, 3000, 4, ADD_MONTHS(SYSDATE, -20), SYSDATE - 5);

INSERT INTO ACCOUNTS VALUES (101,1,'Savings',1000,SYSDATE-50);
INSERT INTO ACCOUNTS VALUES (102,2,'Checking',1500,SYSDATE-30);
INSERT INTO ACCOUNTS VALUES (103,3,'Savings',2000,SYSDATE-11);
INSERT INTO ACCOUNTS VALUES (104,4,'Savings',15000,SYSDATE);

INSERT INTO EMPLOYEES VALUES(1, 'Henry White', 'Manager', 80000, 'Finance', SYSDATE-365);
INSERT INTO EMPLOYEES VALUES(2, 'Camille Brown', 'Analyst', 60000, 'Finance',SYSDATE-100);
INSERT INTO EMPLOYEES VALUES(3, 'David Green', 'Clerk', 40000, 'HR', SYSDATE-200);

COMMIT;
