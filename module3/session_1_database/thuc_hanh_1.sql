create table quan_li_customer.customer(
id_customer  int primary key not null ,
name_customer char(255) not null,
phone_customer char(255) not null,
city char(255) not null,
country char(255) not null );

insert into quan_li_customer.customer value (1,'Thế Anh','12345678','Đà Nẵng','Việt Nam');
insert into quan_li_customer.customer value (2,'Minh chiến','12345678','Quảng Bình','Việt Nam');
insert into quan_li_customer.customer value (3,'Đình Phúc','12345678','Đà Nẵng','Viêt Nam');
select id_customer,name_customer from quan_li_customer.customer;
select * from quan_li_customer.customer where id_customer like '%2%';
select * from quan_li_customer.customer where city in ('Đà Nẵng');