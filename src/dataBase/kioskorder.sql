-- 키오스크 주문 데이터베이스 생성
drop database if exists kioskorder;
create database kioskorder;

use kioskorder;

drop table if exists 카테고리;
create table 카테고리 (
	카테고리코드 int auto_increment,
    카테고리명 varchar(20) not null unique,
    primary key(카테고리코드)
);

drop table if exists 제품;
create table 제품 (
	제품코드 int auto_increment,
    제품명 varchar(20) not null unique,
    가격 int not null,
    카테고리코드 int not null unique,
    primary key(제품코드),
    foreign key(카테고리코드) references 카테고리(카테고리코드)
);

drop table if exists 주문;
create table 주문 (
	주문코드 int auto_increment,
    주문날짜 datetime default now() not null,
    primary key(주문코드)
);

drop table if exists 주문상세;
create table 주문상세 (
	주문상세코드 int auto_increment,
    제품코드 int not null unique,
    수량 int not null,
    주문코드 int not null unique,
    primary key(주문상세코드),
    foreign key(제품코드) references 제품(제품코드),
    foreign key(주문코드) references 주문(주문코드)
);

drop table if exists 카트;
create table 카트 (
	제품코드 int not null unique,
    주문수량 int not null,
    foreign key(제품코드) references 제품(제품코드)
);

select * from 카테고리;
select * from 제품;
select * from 주문;
select * from 카트;
select * from 주문상세;
