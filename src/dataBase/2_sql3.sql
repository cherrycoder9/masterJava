-- 데이터베이스 생성
DROP DATABASE IF EXISTS day03;
CREATE DATABASE day03;

-- 테이블 생성
USE day03;
DROP TABLE IF EXISTS member;
CREATE TABLE member (
    회원번호 INT,
    아이디 VARCHAR(30),
    비밀번호 VARCHAR(30),
    연락처 CHAR(13),
    광고전송여부 BOOLEAN,
    가입일 DATETIME
);

-- 현재 DB내 모든 테이블 확인 
SHOW TABLES;

-- 테이블 검색 
SELECT * FROM member;

# 제약 조건 
# 1. not null : 해당 필드에 null 값을 포함하지 않는다 
create table t1(tno int not null, tname varchar(10));
# 레코드/행/튜플 추가
# values (값1, 값2) 만약에 앞에 필드명을 생략시 필드명 순서대로 값 대입
insert into t1 values(1, "유재석");
# values(값1, 값2) 만약에 앞에 필드명을 작성시 명시 순서대로 값 대입 
insert into t1 (tname, tno) values("강호동", 2);
insert into t1(tno, tname) values (3, "하하"); #
insert into t1(tname) values ("서장훈"); # 오류: 값을 대입하지 않는 필드가 not null 이기 때문에 
insert into t1(tno) values(4); # 오류없음: 값을 대입하지 않는 필드가 not null 하지 않았기 때문에 
# 확인
select * from t1;

# 2. default: 해당 필드의 기본값 설정 
-- 레코드 삽입시 해당 필드에 값을 대입하지 않으면 기본값으로 설정할 값
drop table t2;
create table t2(
	tno int not null,
    tname varchar(10),
    tdate datetime default now(),
    tstate int default 10
);

# 레코드 추가
insert into t2 (tno, tname) values (1, "유재석"); # 생략된 tdate, tstate ???
insert into t2 values(1, "강호동", "2024-06-01 13:11:12", 11);

# 확인
select * from t2;

# 3. unique: 해당 필드내 중복된 값을 허용하지 않는다. [중복제거]
-- 만약에 레코드 삽입시 해당 필드에 값을 대입할때 기존 레코드내 동일값이 있으면 오류 발생 
create table t3(
	tno int not null unique, 
    tname varchar(10), 
    tpoint int default 10
);
insert into t3(tno) values(1);
# insert into t3(tname) values(1, "유재석"); // 유니크 필드 동일값이라 오류 발생 
select * from t3;

# 4. auto_increment = 레코드 삽입시 해당 필드내 자동번호 부여
use day03;
drop table t4;
create table t4(
	tno int not null unique auto_increment, 
    tname varchar(10) default "아무개"
);

insert into t4(tname) values("유재석");
insert into t4(tname) values("유재석");
insert into t4(tname) values("유재석");
insert into t4(tname) values("유재석");
insert into t4(tname) values("유재석"); # 자동으로 tno가 1씩 증가하면서 대입

delete from t4 where tno = 3; # tno '3'인 레코드 삭제 
# 삭제된 자동번호는 더이상 생성되지 않고 마지막 번호에 이어서 1씩 증가 
 
select * from t4;

# primary key : 기본키, 레코드 내 식별 가능한 고유값 가진 키, 참조당하는 키 
# 낫널과 유니크가 자동으로 포함되어 있음 
# primary key(선정할필드명)
drop table t5;
create table t5(
	tno_pk int,
    tname varchar(30),
    primary key(tno_pk) # pk는 유니크, 낫널 안써도 기능 자동으로 포함
);
select * from t5;
# foreign key : 외래키, 다른 테이블내 기본키를 참조하는 키, 참조하는 키 

drop table t6;
create table t6(
	title text, tno_fk int,
    foreign key(tno_fk) references t5(tno_pk)
);

select * from t6;


#  예시 

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
    primary key(rno_pk),
    foreign key(bno_fk) references b(bno_pk),
    foreign key(mno_fk) references m(mno_pk)
);