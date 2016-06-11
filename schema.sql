create database airport default charset=utf8;
create user 'airport'@'localhost' identified by 'password';
grant all on airport.* to 'airport'@'localhost';
-- set password for 'airport'@'localhost' = password('');

use airport;
create table airport (
  id      serial,
  code    nvarchar(64),
  name    nvarchar(200),
  city    nvarchar(200),
  country nvarchar(200)
);

insert into airport(code, name, city, country)
values('BKK', 'Suvarnabhumi', 'Bangkok', 'Thailand');
insert into airport(code, name, city, country)
values('DMK', 'Don Muang', 'Bangkok', 'Thailand');
insert into airport(code, name, city, country)
values('CNX', 'Chiang Mai', 'Chiang Mai', 'Thailand');

