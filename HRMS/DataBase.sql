
CREATE DATABASE HRMSApp;
USE HRMSApp;

-- User Table
CREATE TABLE Users (
    ID BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    passwordHash VARCHAR(255) NOT NULL,
    role_ID BIGINT NOT NULL,
    address TEXT,
    dateOfBirth DATE,
    contactNumber VARCHAR(20),
    department VARCHAR(100),
    createdAt TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updatedAt TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    active BOOLEAN NOT NULL DEFAULT TRUE,
    FOREIGN KEY (role_ID) REFERENCES Roles(ID)
);

-- Role Table
CREATE TABLE Roles (
    ID BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL UNIQUE,
    permissions TEXT NOT NULL  -- Store as comma-separated list or normalize if needed
);

-- Document Table
CREATE TABLE Documents (
    ID BIGINT AUTO_INCREMENT PRIMARY KEY,
    user_ID BIGINT NOT NULL,
    type VARCHAR(50) NOT NULL,
    filePath VARCHAR(255) NOT NULL,
    uploadedAt TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (user_ID) REFERENCES Users(ID)
);

-- LeaveRequest Table
CREATE TABLE LeaveRequests (
    ID BIGINT AUTO_INCREMENT PRIMARY KEY,
    user_ID BIGINT NOT NULL,
    startDate DATE NOT NULL,
    endDate DATE NOT NULL,
    type VARCHAR(30) NOT NULL,
    reason TEXT,
    status ENUM('PENDING','APPROVED','REJECTED','CANCELLED') NOT NULL,
    requestedAt TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    respondedAt TIMESTAMP,
    approver_ID BIGINT,
    FOREIGN KEY (user_ID) REFERENCES Users(ID),
    FOREIGN KEY (approver_ID) REFERENCES Users(ID)
);

-- AttendanceRecord Table
CREATE TABLE AttendanceRecords (
    ID BIGINT AUTO_INCREMENT PRIMARY KEY,
    user_ID BIGINT NOT NULL,
    date DATE NOT NULL,
    checkInTime TIMESTAMP,
    checkOutTime TIMESTAMP,
    location VARCHAR(255),
    UNIQUE (user_ID, date),
    FOREIGN KEY (user_ID) REFERENCES Users(ID)
);

-- SalaryDetail Table
CREATE TABLE SalaryDetails (
    ID BIGINT AUTO_INCREMENT PRIMARY KEY,
    user_ID BIGINT NOT NULL UNIQUE,
    baseSalary DECIMAL(10,2) NOT NULL,
    bonuses DECIMAL(10,2) NOT NULL DEFAULT 0.00,
    deductions DECIMAL(10,2) NOT NULL DEFAULT 0.00,
    effectiveDate DATE NOT NULL,
    FOREIGN KEY (user_ID) REFERENCES Users(ID)
);

-- Payment Table
CREATE TABLE Payments (
    ID BIGINT AUTO_INCREMENT PRIMARY KEY,
    user_ID BIGINT NOT NULL,
    amount DECIMAL(10,2) NOT NULL,
    date TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    method VARCHAR(30) NOT NULL,
    periodStart DATE,
    periodEnd DATE,
    FOREIGN KEY (user_ID) REFERENCES Users(ID)
);

-- Payslip Table
CREATE TABLE Payslips (
    ID BIGINT AUTO_INCREMENT PRIMARY KEY,
    user_ID BIGINT NOT NULL,
    periodStart DATE NOT NULL,
    periodEnd DATE NOT NULL,
    generatedAt TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    filePath VARCHAR(255) NOT NULL,
    FOREIGN KEY (user_ID) REFERENCES Users(ID)
);

-- Department Table
CREATE TABLE Departments (
    ID BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL UNIQUE,
    head_ID BIGINT,
    FOREIGN KEY (head_ID) REFERENCES Users(ID)
);

-- ResignationRequest Table
CREATE TABLE ResignationRequests (
    ID BIGINT AUTO_INCREMENT PRIMARY KEY,
    user_ID BIGINT NOT NULL,
    effectiveDate DATE NOT NULL,
    submissionDate TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    reason TEXT,
    status ENUM('PENDING', 'APPROVED', 'REJECTED', 'WITHDRAWN') NOT NULL,
    approver_ID BIGINT,
    responseDate TIMESTAMP,
    withdrawalDate TIMESTAMP,
    withdrawalReason TEXT,
    FOREIGN KEY (user_ID) REFERENCES Users(ID),
    FOREIGN KEY (approver_ID) REFERENCES Users(ID)
);