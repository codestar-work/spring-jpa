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