REM   Script: act_4&act    -5 sql
REM   act_4 & 5 sql

alter TABLE SALESMAN ADD SLAESMAN_DOB date;

CREATE TABLE SALESMAN(salesman_id int,  
salesman_name varchar2(20),  
salesman_city  varchar2(20),  
commission int) 
 
DESC SALESMAN 
 
INSERT INTO SALESMAN VALUES(5001,'James Hoog','New York',15) 
 
INSERT ALL  
INTO SALESMAN VALUES(5002,'Nail Knite','Paris',13)  
 INTO SALESMAN VALUES      (5005,'Pit Alex','London',11)  
  INTO SALESMAN     VALUES (5006,'McLyon','Paris',14)  
   INTO SALESMAN     VALUES(5007,'Paul Adam','Rome',13)  
    INTO SALESMAN    VALUES(5003,'Lauson Hen','San Jose',12)  
    SELECT 1 FROM DUAL;

CREATE TABLE SALESMAN(salesman_id int,  
salesman_name varchar2(20),  
salesman_city  varchar2(20),  
commission int);

DESC SALESMAN


INSERT INTO SALESMAN VALUES(5001,'James Hoog','New York',15) 
 
INSERT ALL  
INTO SALESMAN VALUES(5002,'Nail Knite','Paris',13)  
 INTO SALESMAN VALUES      (5005,'Pit Alex','London',11)  
  INTO SALESMAN     VALUES (5006,'McLyon','Paris',14)  
   INTO SALESMAN     VALUES(5007,'Paul Adam','Rome',13)  
    INTO SALESMAN    VALUES(5003,'Lauson Hen','San Jose',12)  
    SELECT 1 FROM DUAL;

CREATE TABLE SALESMAN(salesman_id int,  
salesman_name varchar2(20),  
salesman_city  varchar2(20),  
commission int);

DESC SALESMAN


INSERT INTO SALESMAN VALUES(5001,'James Hoog','New York',15) 
 
INSERT ALL  
INTO SALESMAN VALUES(5002,'Nail Knite','Paris',13)  
 INTO SALESMAN VALUES      (5005,'Pit Alex','London',11)  
  INTO SALESMAN     VALUES (5006,'McLyon','Paris',14)  
   INTO SALESMAN     VALUES(5007,'Paul Adam','Rome',13)  
    INTO SALESMAN    VALUES(5003,'Lauson Hen','San Jose',12)  
    SELECT 1 FROM DUAL;

delete salesman;

CREATE TABLE SALESMAN(salesman_id int,  
salesman_name varchar2(20),  
salesman_city  varchar2(20),  
commission int);

DESC SALESMAN


INSERT INTO SALESMAN VALUES(5001,'James Hoog','New York',15) 
 
INSERT ALL  
INTO SALESMAN VALUES(5002,'Nail Knite','Paris',13)  
 INTO SALESMAN VALUES(5005,'Pit Alex','London',11)  
  INTO SALESMAN VALUES (5006,'McLyon','Paris',14)  
   INTO SALESMAN VALUES(5007,'Paul Adam','Rome',13)  
    INTO SALESMAN VALUES(5003,'Lauson Hen','San Jose',12)  
    SELECT 1 FROM DUAL;

alter table salesman add salesman_dob date;

desc salesman


desc salesman


alter salesman modify salesman_dob year;

alter table salesman modify salesman_dob year;

alter table salesman RENAME SALESMAN_DOB TO SALESMAN_BIRTHDAY;

alter table salesman RENAME COLUMN SALESMAN_DOB TO SALESMAN_BIRTHDAY;

DESC SALESMAN


alter table salesman modify COLUMN salesman_BIRTHDAY year;

alter table salesman ALTER COLUMN salesman_BIRTHDAY year;

alter table salesman MODIFY COLUMN salesman_BIRTHDAY year;

ALTER TABLE SALESMAN DROP COLUMN SALESMAN_BIRTHDAY;

DESC SALESMAN


SELECT * FROM SALESMAN;

INSERT INTO SALESMAN VALUES(5001,'James Hoog','New York',15) 
 
INSERT ALL  
  INTO SALESMAN VALUES(5002,'Nail Knite','Paris',13)  
  INTO SALESMAN VALUES(5005,'Pit Alex','London',11)  
  INTO SALESMAN VALUES (5006,'McLyon','Paris',14)  
  INTO SALESMAN VALUES(5007,'Paul Adam','Rome',13)  
    INTO SALESMAN VALUES(5003,'Lauson Hen','San Jose',12)  
    SELECT 1 FROM DUAL;

alter table salesman add salesman_dob date;

desc salesman


select * from salesman;

alter table salesman MODIFY COLUMN salesman_BIRTHDAY year;

alter table salesman RENAME COLUMN SALESMAN_DOB TO SALESMAN_BIRTHDAY;

DESC SALESMAN


ALTER TABLE SALESMAN DROP COLUMN SALESMAN_BIRTHDAY;

DESC SALESMAN


SELECT * FROM SALESMAN;

INSERT INTO SALESMAN VALUES(5001,'James Hoog','New York',15) 
 
INSERT ALL  
  INTO SALESMAN VALUES(5002,'Nail Knite','Paris',13)  
  INTO SALESMAN VALUES(5005,'Pit Alex','London',11)  
  INTO SALESMAN VALUES (5006,'McLyon','Paris',14)  
  INTO SALESMAN VALUES(5007,'Paul Adam','Rome',13)  
    INTO SALESMAN VALUES(5003,'Lauson Hen','San Jose',12)  
    SELECT 1 FROM DUAL;

INSERT INTO SALESMAN VALUES(5001,'James Hoog','New York',15);

INSERT ALL  
  INTO SALESMAN VALUES(5002,'Nail Knite','Paris',13)  
  INTO SALESMAN VALUES(5005,'Pit Alex','London',11)  
  INTO SALESMAN VALUES (5006,'McLyon','Paris',14)  
  INTO SALESMAN VALUES(5007,'Paul Adam','Rome',13)  
    INTO SALESMAN VALUES(5003,'Lauson Hen','San Jose',12)  
    SELECT 1 FROM DUAL;

INSERT INTO SALESMAN VALUES(5001,'James Hoog','New York',15);

INSERT ALL  
  INTO SALESMAN VALUES(5002,'Nail Knite','Paris',13)  
  INTO SALESMAN VALUES(5005,'Pit Alex','London',11)  
  INTO SALESMAN VALUES (5006,'McLyon','Paris',14)  
  INTO SALESMAN VALUES(5007,'Paul Adam','Rome',13)  
    INTO SALESMAN VALUES(5003,'Lauson Hen','San Jose',12)  
    SELECT 1 FROM DUAL;

INSERT ALL  
  INTO SALESMAN VALUES(5002,'Nail Knite','Paris',13)  
  INTO SALESMAN VALUES(5005,'Pit Alex','London',11)  
  INTO SALESMAN VALUES (5006,'McLyon','Paris',14)  
  INTO SALESMAN VALUES(5007,'Paul Adam','Rome',13)  
    INTO SALESMAN VALUES(5003,'Lauson Hen','San Jose',12)  
    SELECT 1 FROM DUAL;

SELECT * FROM SALESMAN;

INSERT ALL  
  INTO SALESMAN VALUES(5002,'Nail Knite','Paris',13)  
  INTO SALESMAN VALUES(5005,'Pit Alex','London',11)  
  INTO SALESMAN VALUES (5006,'McLyon','Paris',14)  
  INTO SALESMAN VALUES(5007,'Paul Adam','Rome',13)  
    INTO SALESMAN VALUES(5003,'Lauson Hen','San Jose',12)  
    SELECT 1 FROM DUAL;

UPDATE SALESMAN SET SALESMAN_ID =5010 WHERE SALESMAN_CITY='Paris';

UPDATE SALESMAN SET SALESMAN_ID =5010 WHERE SALESMAN_CITY='Paris';

SELECT * FROM SALESMAN;

delete from salesman where salesman_id=5010;

select * from salesman;

ALTER TABLE SALESMAN ADD COLUMN GRADE int;

ALTER TABLE SALESMAN ADD GRADE int;

desc salesman


update salesman set grade=100;

select grade,salesman_id from salesman;

update salesman set grade =200 where salesaman_city ='Rome';

update salesman set grade =200 where salesman_city ='Rome';

select * from salesman;

update salesman set grade =300 where salesman_name ='James Hoog';

select * from salesman;

update salesman set salesman_name ='pierre'where salesman_name ='McLyon';

