create database qldv
use qldv
drop table tblUser
create table tblUser(
	userId int identity primary key
	,username varchar(255)
	,email varchar(255)
	,pass varchar(50)
	,phone int 
	,sex binary(2)
	
)

CREATE TABLE tblTicket(
	ticketId	int identity primary key,
	flightId	int foreign key references tblFlight(flightId),
	round_trip binary(2),
	price	int,
	vip	binary(2),
)

create table tblAirline(
	airlineId int identity primary key,
	info varchar 
)

create table tblBill(
	billId int identity primary key
	,ticketId int foreign key references tblTicket(ticketId)
	,userId int foreign key references tblUser(userId)
	,quantum int
)

create table tblFlight(
	flightId int identity primary key
	,flightTime time
	,airlineId int foreign key references tblAirline(airlineId)
	,flightRoute varchar
)


create table tblAdmin(
	adminId int identity primary key
	,adname varchar(255)
	,email varchar(255)
	,pass varchar(50)
	,phone int 
	,sex binary(2)
	
)