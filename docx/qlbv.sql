create database qlbv
use qlbv
drop database qlbv
drop table tblUser
create table tbl_user_profile(
	id int identity primary key
	,name varchar(255)
	,phone int
	,age int 
	,sex binary(2)
	,cmt int
	,creat_at date
	
)

create table tbl_user (
	email varchar(255)
	,pass varchar(60)
)

CREATE TABLE tbl_ticket(
	id	int identity primary key,
	flight_id	int foreign key references tbl_flight(id),
	airplane_id int foreign key references tbl_airplane(id),
	airline_id int foreign key references tbl_airline(id),
	round_trip binary(2),
	price	int,
	vip	binary(2),
	seat varchar(10)
)

create table tbl_airline(
	id int identity primary key,
	info varchar 
)

create table tbl_airplane(
	id int identity primary key
	,name varchar(255)
	,brand varchar(10)
	,number_of_seat int
)

create table tbl_bill(
	id int identity primary key
	,ticket_id int foreign key references tbl_ticket(id)
	,user_id int foreign key references tbl_user_profile(id)
	,quantum int
	,create_at date
)

create table tbl_flight(
	id int identity primary key
	,flight_time time
	,airline_id int foreign key references tbl_airline(id)
	,airplane_id int foreign key references tbl_airplane(id)
)

create table news(
	id int identity primary key
	,title nvarchar(255)
	,content nvarchar
	,publisher_id  int foreign key references tbl_admin(id)
)


create table tbl_admin(
	id int identity primary key
	,admin_name varchar(255)
	,email varchar(255)
	,pass varchar(50)
	,phone int 
	,sex binary(2)
	
)