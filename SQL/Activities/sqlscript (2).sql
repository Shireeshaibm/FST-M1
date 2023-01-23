REM   Script: activity1 _sql
REM   act1

Create TABLE salesman(salesman_id  int, 
salesman_name  varchar2(20), 
salesman_city  varchar2(20), 
commission    int);

DESC salesman


drop salesman;

delete salesman;

Create TABLE salesman(salesman_id  int not null, 
salesman_name  varchar2(20), 
salesman_city  varchar2(20), 
commission    int);

DESC salesman


delete salesman;

Create TABLE salesman(salesman_id  int primary key, 
salesman_name  varchar2(20), 
salesman_city  varchar2(20), 
commission    int);

DESC salesman


delete salesman;

Create TABLE salesman(salesman_id   primary key int, 
salesman_name  varchar2(20), 
salesman_city  varchar2(20), 
commission    int);

DESC salesman


delete salesman;

Create TABLE salesman(salesman_id  int not null , 
salesman_name  varchar2(20), 
salesman_city  varchar2(20), 
commission    int);

DESC salesman


Create TABLE salesman(salesman_id  int not null , 
salesman_name  varchar2(20), 
salesman_city  varchar2(20), 
commission    int);

DESC salesman


