create database coffee_shop default charset=utf8;
create user 'coffee'@'%' identified by 'password';
grant all on coffee_shop.* to 'coffee'@'%';

use coffee_shop;
create table coffee (
  id      serial,
  name    varchar(255),
  size    char,
  price   real
);

insert into coffee (name, size, price) values('Latte', 'T', 110);
insert into coffee (name, size, price) values('Latte', 'G', 125);
insert into coffee (name, size, price) values('Latte', 'V', 140);
insert into coffee (name, size, price) values('Cappuccino', 'T', 110);
insert into coffee (name, size, price) values('Cappuccino', 'G', 125);
insert into coffee (name, size, price) values('Cappuccino', 'V', 140);
