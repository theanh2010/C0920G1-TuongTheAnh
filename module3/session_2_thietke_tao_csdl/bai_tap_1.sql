create database customer_quan_li;
use customer_quan_li;
create table customers(
id_customer int primary key,
name_customer varchar(50),
address_customer varchar(100),
email_customer varchar(50) unique,
phone_customer varchar(10));
create table accounts (
account_number varchar(50) primary key,
type_account varchar(50),
day_open_account date,
balance double,
id_customer int,
FOREIGN	KEY (id_customer) references customers(id_customer));
create table transactions (
OTP varchar(10) primary key,
money double,
account_number varchar(50),
day_tran date,
describe_tran varchar(500),
FOREIGN	KEY (account_number) references accounts(account_number));
