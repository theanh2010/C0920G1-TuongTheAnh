create database bai_tap;
use bai_tap;
create table Categories(
ID int  auto_increment primary key,
name nvarchar(50),
description nvarchar(500));
-- table 2-- 
create table Suppliers(
ID INT,
name NVARCHAR(100),
email VARCHAR(50),
phone_number VARCHAR(50),
address NVARCHAR(500));
create table Customers(
id varchar(50),
first_name nvarchar(50),
last_name nvarchar(50),
phone_number varchar(50),
address nvarchar(50),
email varchar(50),
brithday date
);
create table employees(
id varchar(50),
first_name nvarchar(50),
last_name nvarchar(50),
phone_number varchar(50),
address nvarchar(500),
email varchar(50),
brithday date
);
create table products(
id int,
name nvarchar(50),
image_url nvarchar(1000),
price int,
discount int,
stock int,
brithday date
);
