select * from jspdb.board;

create table board(
bno int not null auto_increment,
title varchar(200),
content text,
writer varchar(100),
isDel varchar(10) default 'N',
registerDate datetime default now(),
read_count int,
primary key(bno));