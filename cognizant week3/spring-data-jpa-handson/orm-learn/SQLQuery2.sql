-- Drop existing connections (if needed)
USE master;
GO

-- 1. Drop database if it exists (correct syntax for SQL Server)
IF DB_ID('ormlearn') IS NOT NULL
BEGIN
    ALTER DATABASE ormlearn SET SINGLE_USER WITH ROLLBACK IMMEDIATE;
    DROP DATABASE ormlearn;
END
GO

-- 2. Drop login if it exists
IF EXISTS (SELECT * FROM sys.server_principals WHERE name = 'springuser')
BEGIN
    DROP LOGIN springuser;
END
GO

-- 3. Create the database
CREATE DATABASE ormlearn;
GO

-- 4. Create server-level login
CREATE LOGIN springuser WITH PASSWORD = 'StrongPassword123!';
GO

-- 5. Use the new database
USE ormlearn;
GO

-- 6. Create DB user for the login
CREATE USER springuser FOR LOGIN springuser;
GO

-- 7. Grant ownership permissions to springuser
ALTER ROLE db_owner ADD MEMBER springuser;
GO

-- 8. Create `country` table
CREATE TABLE country (
    code VARCHAR(2) PRIMARY KEY,
    name VARCHAR(50)
);
GO

-- 9. Insert sample records
INSERT INTO country VALUES ('IN', 'India');
INSERT INTO country VALUES ('US', 'United States of America');
GO
