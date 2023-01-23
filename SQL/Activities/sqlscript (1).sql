REM   Script: activity_2 and 3 sql
REM   act 2&3

CREATE TABLE SALESMAN(salesman_id int, 
salesman_name varchar2(20), 
salesman_city  varchar2(20), 
commission int);

DESC SALESMAN


INSERT INTO SALESMAN VALUES(5001,'James Hoog','New York',15);

SELECT * FROM SALESMAN;

INSERT ALL INTO SALESMAN 
VALUES(5002,'Nail Knite','Paris',13), 
  VALUES      (5005,'Pit Alex','London',11), 
       VALUES (5006,'McLyon','Paris',14), 
        VALUES(5007,'Paul Adam','Rome',13), 
        VALUES(5003,'Lauson Hen','San Jose',12);

INSERT ALL INTO SALESMAN 
INTO SALESMAN VALUES(5002,'Nail Knite','Paris',13) 
 INTO SALESMAN VALUES      (5005,'Pit Alex','London',11) 
  INTO SALESMAN     VALUES (5006,'McLyon','Paris',14) 
   INTO SALESMAN     VALUES(5007,'Paul Adam','Rome',13) 
    INTO SALESMAN    VALUES(5003,'Lauson Hen','San Jose',12);

INSERT ALL INTO SALESMAN 
INTO SALESMAN VALUES(5002,'Nail Knite','Paris',13) 
 INTO SALESMAN VALUES      (5005,'Pit Alex','London',11) 
  INTO SALESMAN     VALUES (5006,'McLyon','Paris',14) 
   INTO SALESMAN     VALUES(5007,'Paul Adam','Rome',13) 
    INTO SALESMAN    VALUES(5003,'Lauson Hen','San Jose',12) 
    SELECT 1 FROM DUAL;

INSERT ALL 
INTO SALESMAN VALUES(5002,'Nail Knite','Paris',13) 
 INTO SALESMAN VALUES(5005,'Pit Alex','London',11) 
  INTO SALESMAN VALUES(5006,'McLyon','Paris',14) 
   INTO SALESMAN VALUES(5007,'Paul Adam','Rome',13) 
    INTO SALESMAN VALUES(5003,'Lauson Hen','San Jose',12) 
    SELECT 1 FROM DUAL;

SELECT * FROM SALESMAN;

SELECT SALESMAN_ID AND SALESMAN_CITY FROM SALESMAN;

SELECT * FROM SALESMAN WHERE SALESMAN_CITY='Paris';

select salesman+id and commision from SALESMAN;

SELECT SALESMAN_ID ,SALESMAN_CITY FROM SALESMAN;

SELECT * FROM SALESMAN WHERE SALESMAN_CITY='Paris';

select salesman_id ,commision from SALESMAN WHERE salesman_name ='Paul Adam';

select salesman_id ,commission from SALESMAN WHERE salesman_name ='Paul Adam';

