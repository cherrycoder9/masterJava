
# 1. 회원
drop table r;
drop table b;
drop table m;
create table m(
	mno_pk int,
    mname varchar(10),
    mphone char(13),
    primary key(mno_pk) -- 해당 필드를 pk로 설정 
);

# 2. 게시물
create table b(
	bno_pk int,
    btitle varchar(100),
    bcontent longtext,
    bdate datetime default now(),
    mno_fk int,
    primary key(bno_pk),
    foreign key(mno_fk) references m(mno_pk)
);

# 3. 게시물 댓글
create table r(
	rno_pk int,
    rcontent text,
    rpwd varchar(20),
    bno_fk int,
    mno_fk int,
    primary key(rno_pk),
    foreign key(bno_fk) references b(bno_pk),
    foreign key(mno_fk) references m(mno_pk)
);