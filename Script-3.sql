create table mentors(
id integer primary key,
name varchar(100),
phone varchar(60)
);

insert into mentors (id, name)
values(1, 'Алексеев Роман Петрович');

insert into mentors (id, name)
values(2, 'Иващук Григорий Пантелеевич');

insert into mentors (id, name)
values (3, 'Москаленко Татьяна Петровна'); 

select * from mentors m; 

create table lange(
id integer primary key,
name varchar(100)
);

insert into lange(id, name)
values(1, 'java');

insert into lange(id, name)
values(2, 'frontend');

insert into lange(id, name)
values(3, 'C#');

select * from lange l;


create table classroom(
id integer primary key,
name varchar(100)
);

insert into classroom (id, name)
values(1, '7.1');

insert into classroom(id, name)
values(2, '7.2' );

insert into classroom(id, name)
values(3, '7.3');

insert into classroom(id, name)
values(4, '8.1');

insert into classroom(id, name)
values(5, '8.2');

select * from classroom c; 


create table homework(
id integer primary key,
name varchar(100),
instruction TEXT
);

insert into homework(id, name, instruction)
values(1, 'homework-44', 'TEXT database');

insert into homework(id, name, instruction)
values(2, 'homework-45', 'TEXT SQL');

insert into homework(id, name, instruction)
values(3, 'homework-46', 'TEXT SQL practice');

select * from homework h;


create table timeslot(
id integer primary key,
startdate date,
enddate date
);

insert into timeslot(id, startdate, enddate)
values(1, '2022-03-11 19:00', '2022-03-11 20:30');

insert into timeslot(id, startdate, enddate)
values(2, '2022-03-11 20:30', '2022-03-11 22:00'); 

insert into timeslot(id, startdate, enddate)
values(3, '2022-03-14 19:00', '2022-03-14 20:30');

insert into timeslot(id, startdate, enddate)
values(4, '2022-03-14 20:30', '2022-03-11 22:00');

select * from timeslot t;

create table academy_group(
id integer primary key,
name varchar(10),
mentors_id integer references mentors(id) unique,
classroom_id integer references classroom(id),
lange_id integer references lange(id),
timeslot_id integer references timeslot(id),
unique (classroom_id, timeslot_id)
);

insert into academy_group(id, name, mentors_id, classroom_id, lange_id, timeslot_id)
values(1, 'Asan', 1, 1, 1, 1);

insert into academy_group(id, name, mentors_id, classroom_id, lange_id, timeslot_id)
values(2, 'Bektur', 2, 2, 2, 2);

insert into academy_group(id, name, mentors_id, classroom_id, lange_id, timeslot_id)
values(3, 'Daniyar', 3, 3, 3, 3);

update academy_group set name = 'JV-F21' where id=1;

update academy_group set name = 'FR-21' where id=2;

update academy_group set name = 'C#-21' where id=3;

select * from academy_group ag; 

create table personal_info(
id integer primary key,
inn varchar(14) unique,
adress varchar(200)
);

insert into personal_info(id, inn, adress)
values (1, '21001200000045', 'Бишкек, мкр.6, д.5, кв.36');

insert into personal_info(id, inn, adress)
values (2, '21502199500048', 'Бишкек, мкр.4, д.11, кв.23');

insert into personal_info(id, inn, adress)
values (3, '20608200100055', 'Бишкек, мкр.11, д.8, кв.15');

select * from personal_info pi;


create table student(
id integer primary key,
name varchar(100),
academy_group_id integer references academy_group(id) unique,
phone varchar(50),
personal_info_id integer references personal_info(id) unique  
);

insert into student(id, name, academy_group_id, phone, personal_info_id)
values(1, 'Asan', 1, '0550 577567', 1);

insert into student(id, name, academy_group_id, phone, personal_info_id)
values(2, 'Bektur', 2, '0551 570580', 2);

insert into student(id, name, academy_group_id, phone, personal_info_id)
values(3, 'Daniyar', 3, '0555 577567', 3);

select * from student s; 


create table payments(
id integer primary key,
amount DOUBLE PRECISION,
createDate date,
student_id integer references student(id) unique 
);

insert into payments(id, amount, createDate, student_id)
values(1, 10000.00, '2022-03-10', 1);

insert into payments(id, amount, createDate, student_id)
values(2, 20000.00, '2022-03-07', 2);

insert into payments(id, amount, createDate, student_id)
values(3, 90000.00, '2021-11-06', 3);

select * from payments p;


create table mark(
id integer primary key,
student_id integer references student(id) unique,
score integer unique,
homework_id integer references homework(id)  
);

insert  into mark(id, student_id, score, homework_id)
values(1, 1, 55, 1); 

insert  into mark(id, student_id, score, homework_id)
values(2, 2, 62, 2);

insert  into mark(id, student_id, score, homework_id)
values(3, 3, 70, 3);

select *from mark m; 

select m.score, p.createDate, p.amount, s.name, ag.name 
from mark m join student s on s.id = m.student_id 
join academy_group ag on ag.id = s.id 
join payments p on p.id = s.id 

select * from mark 
where score <  61

select avg (score) from mark

select count(student) from student s 
group by academy_group.name  