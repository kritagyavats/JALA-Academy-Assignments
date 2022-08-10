/*Ques03) Display names and commissions of all salespeople in London.*/

CREATE TABLE Salespeople (

    Snum INT NOT NULL PRIMARY KEY,
    Sname VARCHAR (50) NOT NULL,
    City VARCHAR (50),
    Comm FLOAT
);
GO

INSERT INTO Salespeople VALUES
    (1001,'Peel','London',0.12),
    (1002,'Serres','San Jose',0.13),
    (1004,'Motika','London',0.11),
    (1007,'Rafkin','Barcelona',0.15),
    (1003,'Axelrod','New york',0.1).

SELECT Snum, Comm
FROM Salespeople
WHERE City = 'London’.
GO 
