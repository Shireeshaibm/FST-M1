REM   Script: act_6sql
REM   act_6 sql

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

select * from salesman order by grade;

select * from salesman order by salesman_id;

select * from salesman order by salesman_id ,grade desc;

select distinct grade from salesman;

select distinct grade from salesman order by grade;

select grade from salesman where NOT salesman_city ='Paris';

- Create a table named orders 


create table orders( 
    order_no int primary key, purchase_amount float, order_date date, 
    customer_id int, salesman_id int);

INSERT ALL 
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005) 
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001) 
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006) 
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002) 
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007) 
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001) 
SELECT 1 FROM DUAL;

create table orders( 
    order_no int primary key, purchase_amount float, order_date date, 
    customer_id int, salesman_id int);

INSERT ALL 
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005) 
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001) 
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006) 
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002) 
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007) 
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001) 
SELECT 1 FROM DUAL;

Delete orders;

create table orders( 
    order_no int primary key, purchase_amount float, order_date date, 
    customer_id int, salesman_id int);

INSERT ALL 
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005) 
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001) 
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006) 
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002) 
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007) 
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001) 
SELECT 1 FROM DUAL;

select distinct salesman_id from orders;

select order_no from orders order by order_date;

select order_no,purchase_amount from orders order by purchase_amount DESC;

select * from orders where purchase_amount <500;

select * from orders where purchase_amount between 1000 and 2000;

