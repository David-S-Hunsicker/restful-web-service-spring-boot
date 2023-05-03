insert into user_details(id,birth_date,name)
values(1001, current_date(), 'Rick');
insert into user_details(id,birth_date,name)
values(1005, current_date(), 'Sakisha');
insert into user_details(id,birth_date,name)
values(1003, current_date(), 'Burt');


insert into post(id, description, user_id)
values(2001, 'Im a Scientist', 1001);

insert into post(id, description, user_id)
values(2002, 'Im a Doctor', 1005);

insert into post(id, description, user_id)
values(2003, 'I Make lip balm', 1003);
