
use springdb;

select count(*) from board; 329; 328;
select * from file; 36; 34; 
select * from comment; 66; 62; 


select * from board;


update board set cmt_qty = (select count(*) from comment where comment.bno = board.bno);

update board set cmt_qty = (select count(cno) from comment where comment.bno = board.bno); 



select count(*) from comment where comment.bno = 335;
select count(*) from board where board.bno = 335;

select * from member;


alter table auth_member drop primary key;
commit;
select * from auth_member;

select * from member;

select * from auth_member;
use springdb;

select * from Auth_Member;

use springdb;
delete from file;
delete from springdb.auth_member;
delete from board;
comment from auth_member;
file from auth_member;
member from auth_member;

alter table comment add constraint fk_comm foreign key(bno)
references board(bno) on delete cascade;


alter table file add constraint fk_file foreign key(bno)
references board(bno) on delete cascade;

alter table auth_member add constraint fk_auth foreign key(email) 
references member(email) on delete cascade;



select * from auth_member;
select * from member;
select * from board;
select * from file;
select * from comment;

update auth_member set auth = 'ROLE_ADMIN' where email = 'ad@ad.ad';