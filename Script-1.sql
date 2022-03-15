create sequence vid_sporta_id_seq;

create table vid_sporta (
id integer primary key default nextval('vid_sporta_id_seq'),
name varchar(115),
salary integer  
);



insert into vid_sporta (name, salary) 
values('Football', 100000);

insert into vid_sporta (name, salary) 
values('basketball', 80000);

insert into vid_sporta (name, salary) 
values('volleyball', 50000);

insert into vid_sporta (name, salary) 
values('hokkey', 70000);

select * from  vid_sporta vs;



create sequence coaches_id_seq;

create table coaches(
id integer primary key default nextval('coaches_id_seq'),
fullname varchar(150),NOT NULL,
vid_sporta id integer REFERENCES vid_sporta (id) NOT NULL,,
phonenumber varchar(60),
inn varchar(14) NOT NULL UNIQUE
);

insert into coaches (fullname, vid_sporta, phonenumber, inn)
values('Ivanov', 1, '0755 65 65 14', '21406197800042');
 
insert into coaches (fullname, vid_sporta, phonenumber,inn)
values('Petrov', 2, '0551 580 590', '21602198000045');

insert into coaches (fullname, vid_sporta, phonenumber,inn)
values('Sidorov', 3, '0552 578 564', '21011198500026');

insert into coaches (fullname, vid_sporta, phonenumber,inn)
values('Jonson', 4, '22512198400037');

insert into coaches (fullname, vid_sporta, phonenumber,inn)
values('Sidorov', 3, '21011198500026');

select * from  coaches c;



create sequence visitors_id_seq;

create table visitors (
fullname varchar(50),
year timestamp,
gender varchar(10) 
);

insert into visitors (fullname, year, gender)
values('Valentina', '1995-6-25', 'women');

insert into visitors (fullname, year, gender)
values('Aleksey', '1990-7-21', 'man');

insert into visitors (fullname, year, gender)
values('Bob', '1980-12-31', 'man');

select * from visitors v;



create sequence visits_id_seq;

create table visits (
visitors integer,
visiting_time timestamp,
coaches integer 
); 

insert into visits (visitors, visiting_time, coaches)
values(1, '2022-3-5 15:00', 2);

insert into visits (visitors, visiting_time, coaches)
values(2, '2022-3-5 17:00', 1);

insert into visits (visitors, visiting_time, coaches)
values(3, '2022-3-5 19:00', 3);

select * from visits v;