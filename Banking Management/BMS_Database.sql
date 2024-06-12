create database bankmanagementsystem;

show databases;

use bankmanagementsystem;

create table signup1(form_no varchar(20), Acc_holder_name varchar(40), Father_Name varchar(40), Mother_Name varchar(40), Gender varchar(20), DOB varchar(40), Email varchar(50), Marital_Status varchar(40), Address varchar(150), city varchar(80), State varchar(80), Nationality varchar(40)); 
show tables;
select * from signup1;

create table signup2(form_no varchar(20), Religion varchar(40), Category varchar(40), Income varchar(40), Educational_Qualif varchar(20), Occupation varchar(40), Pan_Card varchar(50), AadharCard varchar(40), Citizen varchar(40), Existing_Acc varchar(40)); 
show tables;
select *from signup2;

create table signup3(formno varchar(20), AccType varchar(20), Account_No varchar(25), Login_Password varchar(20), Facility varchar(400)); 
select *from signup3;

show tables;

create table login(formno varchar(20), Account_No varchar(20), Login_Password varchar(20));
select *from login;


create table bank(Login_Password varchar(10), Account_No varchar(40), date varchar(100), type varchar(20), amount varchar(20));
select *from bank;







