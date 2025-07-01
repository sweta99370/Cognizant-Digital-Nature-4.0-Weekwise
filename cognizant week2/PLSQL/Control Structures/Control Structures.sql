-- Drop tables if they already exist
BEGIN
  EXECUTE IMMEDIATE 'DROP TABLE Loans';
EXCEPTION
  WHEN OTHERS THEN NULL;
END;
/

BEGIN
  EXECUTE IMMEDIATE 'DROP TABLE Customers';
EXCEPTION
  WHEN OTHERS THEN NULL;
END;
/

-- Create Customers table with IsVIP column
CREATE TABLE Customers (
    CustomerID NUMBER PRIMARY KEY,
    Name VARCHAR2(100),
    DOB DATE,
    Balance NUMBER,
    LastModified DATE,
    IsVIP CHAR(1) DEFAULT 'N'
);

-- Create Loans table
CREATE TABLE Loans (
    LoanID NUMBER PRIMARY KEY,
    CustomerID NUMBER,
    LoanAmount NUMBER,
    InterestRate NUMBER,
    StartDate DATE,
    EndDate DATE,
    FOREIGN KEY (CustomerID) REFERENCES Customers(CustomerID)
);

-- Insert sample customers
INSERT INTO Customers VALUES (1, 'John Doe', TO_DATE('1950-01-01', 'YYYY-MM-DD'), 12000, SYSDATE, 'N');
INSERT INTO Customers VALUES (2, 'Jane Smith', TO_DATE('1990-07-20', 'YYYY-MM-DD'), 8000, SYSDATE, 'N');

-- Insert sample loans
INSERT INTO Loans VALUES (1, 1, 10000, 5.0, SYSDATE, ADD_MONTHS(SYSDATE, 60)); -- John Doe
INSERT INTO Loans VALUES (2, 2, 15000, 6.5, SYSDATE, ADD_DAYS(SYSDATE, 25)); -- Jane Smith

COMMIT;

-- SCENARIO 1: Apply 1% discount to loan interest rates if age > 60
BEGIN
  FOR rec IN (
    SELECT l.LoanID, l.InterestRate, c.DOB, c.Name
    FROM Loans l
    JOIN Customers c ON l.CustomerID = c.CustomerID
  ) LOOP
    IF MONTHS_BETWEEN(SYSDATE, rec.DOB)/12 > 60 THEN
      UPDATE Loans
      SET InterestRate = InterestRate * 0.99
      WHERE LoanID = rec.LoanID;

      DBMS_OUTPUT.PUT_LINE('Discount applied to LoanID: ' || rec.LoanID || ' for customer: ' || rec.Name);
    ELSE
      DBMS_OUTPUT.PUT_LINE('No discount for customer: ' || rec.Name);
    END IF;
  END LOOP;
END;
/

-- SCENARIO 2: Promote to VIP if balance > 10,000
BEGIN
  FOR cust IN (SELECT CustomerID, Name, Balance FROM Customers) LOOP
    IF cust.Balance > 10000 THEN
      UPDATE Customers SET IsVIP = 'Y' WHERE CustomerID = cust.CustomerID;
      DBMS_OUTPUT.PUT_LINE('Customer ' || cust.Name || ' promoted to VIP.');
    ELSE
      DBMS_OUTPUT.PUT_LINE('Customer ' || cust.Name || ' is not eligible for VIP.');
    END IF;
  END LOOP;
END;
/

-- SCENARIO 3: Send reminders for loans due in next 30 days
BEGIN
  FOR rec IN (
    SELECT l.LoanID, l.EndDate, c.Name
    FROM Loans l
    JOIN Customers c ON l.CustomerID = c.CustomerID
    WHERE l.EndDate BETWEEN SYSDATE AND SYSDATE + 30
  ) LOOP
    DBMS_OUTPUT.PUT_LINE('Reminder: LoanID ' || rec.LoanID || ' for customer ' || rec.Name ||
                         ' is due on ' || TO_CHAR(rec.EndDate, 'YYYY-MM-DD'));
  END LOOP;
END;
/
