drop database if exists day06;
create database day06;
use day06;

# 1. 회원테이블
drop table if exists member;
create table member(
	mid varchar(30) not null unique,
    mpwd varchar(30) not null,
    mname varchar(20) not null,
    mphone varchar(15) not null,
    mdate datetime default now(),
    mno int  auto_increment,
    primary key(mno)
);

INSERT INTO member (mid, mpwd, mname, mphone) VALUES ('hello1', '1234', '유재석', '000-0000-0000');
INSERT INTO member (mid, mpwd, mname, mphone) VALUES ('hello2', '1234', '강호동', '000-0000-0000');
INSERT INTO member (mid, mpwd, mname, mphone) VALUES ('hello3', '1234', '신동엽', '000-0000-0000');
INSERT INTO member (mid, mpwd, mname, mphone) VALUES ('hello4', '1234', '마동석', '000-0000-0000');
INSERT INTO member (mid, mpwd, mname, mphone) VALUES ('hello5', '1234', '전지현', '000-0000-0000');
select * from member;

# 2. 게시물 테이블
drop table if exists board;
create table board(
	btitle varchar(100) not null,
    bcontent longtext,
    bdate datetime default now(),
    bview smallint default 0,
    mno int,
    bno int auto_increment,
    primary key(bno),
    foreign key(mno) references member(mno)
);

INSERT INTO board (btitle, bcontent, mno) VALUES ('제목입니다 1', '내용이빈다 1', 1);
INSERT INTO board (btitle, bcontent, mno) VALUES ('제목입니다 2', '내용이빈다 2', 5);
INSERT INTO board (btitle, bcontent, mno) VALUES ('제목입니다 3', '내용이빈다 3', 3);
INSERT INTO board (btitle, bcontent, mno) VALUES ('제목입니다 4', '내용이빈다 4', 5);
INSERT INTO board (btitle, bcontent, mno) VALUES ('제목입니다 5', '내용이빈다 5', 2);

select * from board;

# 3. 댓글 테이블 
drop table if exists reply;
create table reply(
	rcontent varchar(200) not null,
    rdate datetime default now(),
    mno int,
    bno int,
    rno int auto_increment,
    primary key(rno),
    foreign key(mno) references member(mno),
    foreign key(bno) references board(bno)
);

INSERT INTO reply (rcontent, mno, bno) VALUES ('댓글내용', 1, 2); # 1번 회원이 2번 게시물에 댓글 씀
INSERT INTO reply (rcontent, mno, bno) VALUES ('댓글내용', 2, 2); # 2번 회원이 2번 게시물에 댓글 씀
INSERT INTO reply (rcontent, mno, bno) VALUES ('댓글내용', 4, 1); # 4번 회원이 1번 게시물에 댓글 씀
INSERT INTO reply (rcontent, mno, bno) VALUES ('댓글내용', 4, 2); # 4번 회원이 2번 게시물에 댓글 씀
INSERT INTO reply (rcontent, mno, bno) VALUES ('댓글내용', 5, 3); # 5번 회원이 3번 게시물에 댓글 씀

select * from reply;

# ER 다이어그램 확인

# 검색 
# 1. 전체검색 
SELECT * FROM member;
# 2. 조건검색
SELECT * FROM member WHERE mno = 1; -- mno가 '1'인 회원 레코드 검색
SELECT * FROM member WHERE mid = 'que1'; -- mid가 'que1'인 회원 레코드 검색 
SELECT * FROM member WHERE mphone = '010-0000-0000';

# 아이디찾기READ (회원명과 연락처가 동일한 회원)
# 비교연산자: >초과 <미만 >=이상 <=이하 =같다 !=같지 않다 
# 관계연산자: and or not 
SELECT * FROM member WHERE mname = '유재석' AND mphone = '000-0000-0000';
# JDBC 매개변수 대입: SELECT * FROM member WHERE mname = ? and mphone = ?;

# 비밀번호찾기READ (아이디와 연락처가 동일한 회원 검색)
SELECT * FROM member WHERE mid = 'que1' AND mphone = '010-0000-0000';
# JDBC 매개변수 대입: SELECT * FROM member WHERE mid = ? and mphone = ?;

# 로그인READ (아이디와 비밀번호가 동일한 회원 검색)
SELECT * FROM member WHERE mid = 'hello1' AND mpwd = '1234';
# JDBC 매개변수 대입: SELECT * FROM member WHERE mid = ? AND mpwd = ?;