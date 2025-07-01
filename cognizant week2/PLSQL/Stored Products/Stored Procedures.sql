-- ==========================
-- DROP & CREATE TABLES
-- ==========================

BEGIN
  EXECUTE IMMEDIATE 'DROP TABLE Accounts';
EXCEPTION WHEN OTHERS THEN NULL;
END;
/

BEGIN
  EXECUTE IMMEDIATE 'DROP TABLE Employees';
EXCEPTION WHEN OTHERS THEN NULL;
END;
/

-- Create Accounts table
CREATE TABLE Accounts (
  AccountID NUMBER PRIMARY KEY,
  CustomerID NUMBER,
  AccountType VARCHAR2(20),
  Balance NUMBER,
  LastModified DATE
);

-- Create Employees table
CREATE TABLE Employees (
  EmployeeID NUMBER PRIMARY KEY,
  Name VARCHAR2(100),
  Position VARCHAR2(50),
  Salary NUMBER,
  Department VARCHAR2(50),
  HireDate DATE
);

-- ==========================
-- INSERT SAMPLE DATA
-- ==========================

-- Sample accounts (Savings and Checking)
INSERT INTO Accounts VALUES (1, 1, 'Savings', 2000, SYSDATE);
INSERT INTO Accounts VALUES (2, 1, 'Checking', 3000, SYSDATE);
INSERT INTO Accounts VALUES (3, 2, 'Savings', 5000, SYSDATE);

-- Sample employees
INSERT INTO Employees VALUES (1, 'Alice', 'Manager', 80000, 'HR', TO_DATE('2016-06-01', 'YYYY-MM-DD'));
INSERT INTO Employees VALUES (2, 'Bob', 'Analyst', 60000, 'Finance', TO_DATE('2018-03-15', 'YYYY-MM-DD'));
INSERT INTO Employees VALUES (3, 'Charlie', 'Developer', 50000, 'IT', TO_DATE('2019-01-10', 'YYYY-MM-DD'));

COMMIT;

-- ==========================
-- PROCEDURE 1: ProcessMonthlyInterest
-- ==========================
CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
  FOR acc IN (
    SELECT AccountID, Balance
    FROM Accounts
    WHERE AccountType = 'Savings'
  ) LOOP
    UPDATE Accounts
    SET Balance = Balance + (Balance * 0.01)
    WHERE AccountID = acc.AccountID;

    DBMS_OUTPUT.PUT_LINE('Interest applied to AccountID: ' || acc.AccountID);
  END LOOP;

  COMMIT;
END;
/

-- ==========================
-- PROCEDURE 2: UpdateEmployeeBonus
-- ==========================
CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus(
  p_dept IN VARCHAR2,
  p_bonus_pct IN NUMBER
) IS
BEGIN
  UPDATE Employees
  SET Salary = Salary + (Salary * p_bonus_pct / 100)
  WHERE Department = p_dept;

  COMMIT;

  DBMS_OUTPUT.PUT_LINE('Bonus applied to department: ' || p_dept);
EXCEPTION
  WHEN OTHERS THEN
    ROLLBACK;
    DBMS_OUTPUT.PUT_LINE('Error applying bonus: ' || SQLERRM);
END;
/

-- ==========================
-- PROCEDURE 3: TransferFunds
-- ==========================
CREATE OR REPLACE PROCEDURE TransferFunds(
  p_from_acc_id IN NUMBER,
  p_to_acc_id IN NUMBER,
  p_amount IN NUMBER
) IS
  v_balance NUMBER;
BEGIN
  SELECT Balance INTO v_balance FROM Accounts WHERE AccountID = p_from_acc_id;

  IF v_balance < p_amount THEN
    RAISE_APPLICATION_ERROR(-20001, 'Insufficient balance.');
  END IF;

  -- Perform transfer
  UPDATE Accounts
  SET Balance = Balance - p_amount
  WHERE AccountID = p_from_acc_id;

  UPDATE Accounts
  SET Balance = Balance + p_amount
  WHERE AccountID = p_to_acc_id;

  COMMIT;
  DBMS_OUTPUT.PUT_LINE('Transfer successful: ' || p_amount || ' transferred from Account ' ||
                       p_from_acc_id || ' to ' || p_to_acc_id);
EXCEPTION
  WHEN OTHERS THEN
    ROLLBACK;
    DBMS_OUTPUT.PUT_LINE('Transfer failed: ' || SQLERRM);
END;
/

-- ==========================
-- TEST PROCEDURE CALLS
-- ==========================

-- Apply interest to savings accounts
BEGIN
  ProcessMonthlyInterest;
END;
/

-- Apply bonus to HR department
BEGIN
  UpdateEmployeeBonus('HR', 10);
END;
/

-- Transfer funds between accounts
BEGIN
  TransferFunds(2, 3, 1000);
END;
/
