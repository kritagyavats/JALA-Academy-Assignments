/*Ques 01) Display snum,sname,city and comm of all salespeople.*/

CREATE TABLE Salespeople (

    Snum INT NOT NULL PRIMARY KEY,
    Sname VARCHAR (50) NOT NULL,
    City VARCHAR (50),
    Comm FLOAT
);

INSERT INTO Salespeople VALUES
    (1001,'Peel','London',0.12),
    (1002,'Serres','San Jose',0.13),
    (1004,'Motika','London',0.11),
    (1007,'Rafkin','Barcelona',0.15),
    (1003,'Axelrod','New york',0.1).

SELECT Snum, Sname, City, Comm
FROM Salespeople.
