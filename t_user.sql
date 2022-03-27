drop database mybatis;
create database mybatis;
use mybatis;
create table t_user(
id int primary key auto_increment,
username varchar(255),
password varchar(255),
age int,
sex char,
email varchar(255)
);
