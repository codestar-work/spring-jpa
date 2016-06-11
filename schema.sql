create database airport default charset=utf8;
create user 'airport'@'localhost' identified by 'password';
grant all on airport.* to 'airport'@'localhost';
-- set password for 'airport'@'localhost' = password('');

use airport;
create table airport (
  id   serial,
  code nvarchar(64)
);

insert into airport(code) values('BKK');
