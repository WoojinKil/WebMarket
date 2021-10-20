create table board(
	num int not null auto_increment,
	id varchar(20) not null,
	name varchar(20) not null,
	subject varchar(100) not null,
	content text not null,
	regist_day varchar(30),
	Primary key(num)


)default charset=utf8;