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
INSERT INTO member (mid, mpwd, mname, mphone) VALUES ('hello6', '1234', '이병헌', '010-1234-5678');
INSERT INTO member (mid, mpwd, mname, mphone) VALUES ('hello7', '1234', '송강호', '010-2345-6789');
INSERT INTO member (mid, mpwd, mname, mphone) VALUES ('hello8', '1234', '김혜수', '010-3456-7890');
INSERT INTO member (mid, mpwd, mname, mphone) VALUES ('hello9', '1234', '하정우', '010-4567-8901');
INSERT INTO member (mid, mpwd, mname, mphone) VALUES ('hello10', '1234', '황정민', '010-5678-9012');
INSERT INTO member (mid, mpwd, mname, mphone) VALUES ('hello11', '1234', '손예진', '010-6789-0123');
INSERT INTO member (mid, mpwd, mname, mphone) VALUES ('hello12', '1234', '박보검', '010-7890-1234');
INSERT INTO member (mid, mpwd, mname, mphone) VALUES ('hello13', '1234', '한효주', '010-8901-2345');
INSERT INTO member (mid, mpwd, mname, mphone) VALUES ('hello14', '1234', '정우성', '010-9012-3456');
INSERT INTO member (mid, mpwd, mname, mphone) VALUES ('hello15', '1234', '김태리', '010-0123-4567');
INSERT INTO member (mid, mpwd, mname, mphone) VALUES ('hello16', '1234', '이준기', '010-1234-5678');
INSERT INTO member (mid, mpwd, mname, mphone) VALUES ('hello17', '1234', '박신혜', '010-2345-6789');
INSERT INTO member (mid, mpwd, mname, mphone) VALUES ('hello18', '1234', '송중기', '010-3456-7890');
INSERT INTO member (mid, mpwd, mname, mphone) VALUES ('hello19', '1234', '이제훈', '010-4567-8901');
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
    # 회원이 탈퇴하면 게시물 어떻게 살건지.. 제약조건 설정하기
    # 회원의 pk값이 삭제/수정되면 제약조건 설정 
    on delete cascade on update cascade
);


INSERT INTO board (btitle, bcontent, mno) VALUES ('제목입니다 1', '내용이빈다 1', 1);
INSERT INTO board (btitle, bcontent, mno) VALUES ('제목입니다 2', '내용이빈다 2', 5);
INSERT INTO board (btitle, bcontent, mno) VALUES ('제목입니다 3', '내용이빈다 3', 3);
INSERT INTO board (btitle, bcontent, mno) VALUES ('제목입니다 4', '내용이빈다 4', 5);
INSERT INTO board (btitle, bcontent, mno) VALUES ('제목입니다 5', '내용이빈다 5', 2);
INSERT INTO board (btitle, bcontent, mno) VALUES ('새로운 소식', '오늘 새로운 업데이트가 적용되었습니다.', 1);
INSERT INTO board (btitle, bcontent, mno) VALUES ('업데이트 공지', '다음 주에 대규모 업데이트가 예정되어 있습니다.', 5);
INSERT INTO board (btitle, bcontent, mno) VALUES ('이벤트 안내', '곧 있을 특별 이벤트에 참여하세요!', 3);
INSERT INTO board (btitle, bcontent, mno) VALUES ('공지사항', '시스템 점검이 예정되어 있습니다.', 5);
INSERT INTO board (btitle, bcontent, mno) VALUES ('리뷰', '최근 제품에 대한 리뷰를 작성했습니다.', 2);
INSERT INTO board (btitle, bcontent, mno) VALUES ('질문 있습니다', '이 기능에 대해 질문이 있습니다.', 4);
INSERT INTO board (btitle, bcontent, mno) VALUES ('정보 공유', '유용한 정보를 공유합니다.', 1);
INSERT INTO board (btitle, bcontent, mno) VALUES ('팁과 트릭', '효율적으로 사용하는 팁을 알려드립니다.', 2);
INSERT INTO board (btitle, bcontent, mno) VALUES ('업데이트 내역', '최신 업데이트 내역을 확인하세요.', 3);
INSERT INTO board (btitle, bcontent, mno) VALUES ('문의 드립니다', '서비스 이용 중 문의 사항이 있습니다.', 4);
INSERT INTO board (btitle, bcontent, mno) VALUES ('버그 리포트', '발견한 버그를 보고합니다.', 2);
INSERT INTO board (btitle, bcontent, mno) VALUES ('사용 후기', '제품 사용 후기를 남깁니다.', 5);
INSERT INTO board (btitle, bcontent, mno) VALUES ('기능 요청', '새로운 기능을 요청합니다.', 1);
INSERT INTO board (btitle, bcontent, mno) VALUES ('이벤트 결과', '이벤트 결과를 발표합니다.', 3);
INSERT INTO board (btitle, bcontent, mno) VALUES ('공지사항', '중요 공지 사항을 확인하세요.', 4);

select * from board;

# 3. 댓글 테이블 
drop table if exists reply;
CREATE TABLE reply (
    rno INT AUTO_INCREMENT,                 -- 댓글 번호
    rcontent VARCHAR(200) NOT NULL,         -- 댓글 내용
    rdate DATETIME DEFAULT NOW(),           -- 댓글 작성 날짜
    mno INT,                                -- 작성자 회원 번호
    bno INT,                                -- 게시물 번호
    PRIMARY KEY (rno),                      -- 기본 키 설정
    FOREIGN KEY (mno) REFERENCES member(mno)
        ON DELETE CASCADE 
        ON UPDATE CASCADE,                  -- 회원이 삭제되면 댓글도 삭제
    FOREIGN KEY (bno) REFERENCES board(bno)
        ON DELETE CASCADE 
        ON UPDATE CASCADE                   -- 게시물이 삭제되면 댓글도 삭제
);

INSERT INTO reply (rcontent, mno, bno) VALUES ('댓글내용', 1, 2); # 1번 회원이 2번 게시물에 댓글 씀
INSERT INTO reply (rcontent, mno, bno) VALUES ('댓글내용', 2, 2); # 2번 회원이 2번 게시물에 댓글 씀
INSERT INTO reply (rcontent, mno, bno) VALUES ('댓글내용', 4, 1); # 4번 회원이 1번 게시물에 댓글 씀
INSERT INTO reply (rcontent, mno, bno) VALUES ('댓글내용', 4, 2); # 4번 회원이 2번 게시물에 댓글 씀
INSERT INTO reply (rcontent, mno, bno) VALUES ('댓글내용', 5, 3); # 5번 회원이 3번 게시물에 댓글 씀
INSERT INTO reply (rcontent, mno, bno) VALUES ('좋은 글 감사합니다.', 1, 2); # 1번 회원이 2번 게시물에 댓글 씀
INSERT INTO reply (rcontent, mno, bno) VALUES ('동의합니다.', 2, 2); # 2번 회원이 2번 게시물에 댓글 씀
INSERT INTO reply (rcontent, mno, bno) VALUES ('유익한 정보네요.', 4, 1); # 4번 회원이 1번 게시물에 댓글 씀
INSERT INTO reply (rcontent, mno, bno) VALUES ('질문이 있습니다.', 4, 2); # 4번 회원이 2번 게시물에 댓글 씀
INSERT INTO reply (rcontent, mno, bno) VALUES ('잘 읽었습니다.', 5, 3); # 5번 회원이 3번 게시물에 댓글 씀
INSERT INTO reply (rcontent, mno, bno) VALUES ('추가 설명 부탁드립니다.', 3, 4); # 3번 회원이 4번 게시물에 댓글 씀
INSERT INTO reply (rcontent, mno, bno) VALUES ('정말 도움이 되었습니다.', 1, 5); # 1번 회원이 5번 게시물에 댓글 씀
INSERT INTO reply (rcontent, mno, bno) VALUES ('재밌는 글이네요.', 2, 1); # 2번 회원이 1번 게시물에 댓글 씀
INSERT INTO reply (rcontent, mno, bno) VALUES ('더 알고 싶습니다.', 3, 2); # 3번 회원이 2번 게시물에 댓글 씀
INSERT INTO reply (rcontent, mno, bno) VALUES ('감사합니다!', 5, 4); # 5번 회원이 4번 게시물에 댓글 씀
INSERT INTO reply (rcontent, mno, bno) VALUES ('잘 정리된 글입니다.', 2, 3); # 2번 회원이 3번 게시물에 댓글 씀
INSERT INTO reply (rcontent, mno, bno) VALUES ('알기 쉽게 설명해주셔서 감사합니다.', 4, 5); # 4번 회원이 5번 게시물에 댓글 씀
INSERT INTO reply (rcontent, mno, bno) VALUES ('유용한 팁이네요.', 3, 1); # 3번 회원이 1번 게시물에 댓글 씀
INSERT INTO reply (rcontent, mno, bno) VALUES ('잘 보고 갑니다.', 1, 3); # 1번 회원이 3번 게시물에 댓글 씀
INSERT INTO reply (rcontent, mno, bno) VALUES ('도움이 되었어요.', 5, 1); # 5번 회원이 1번 게시물에 댓글 씀

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

# 탈퇴
# 1. 회원번호가 '1'인 회원 삭제 
# delete from member where mno = 1;
# 2. 회원번호가 '1' 이면서 비밀번호가 '2' 인 회원 삭제
# delete from member where mno = 1 and mpwd = 2;
# JDBC SQL: delete from member where mno = ? and mpwd = ?;

SELECT * FROM member;
SELECT * FROM board;
SELECT * FROM reply;

# 조회
# 1. 전체 조회 
select * from board;

# 2. 개별 조회 (조건이 들어감)
select * from board where bno = 3;

# 삭제
delete from board where bno = 0; # 0번 게시물 삭제 
delete from board where bno = 0 and mno = 0; # 작성자번호와 게시물번호가 0인 레코드 삭제

# 게시물 출력
use day06;
select * from board;

# 게시물 출력시 mno가 아닌 mid 출력
# 1. 두 테이블을 출력한다
select * from board, member;
# 2. 두 테이블의 관계 기준으로 (내부/교집합) 조인한다.
select * from board, member where board.mno = member.mno;
select * from board natural join member;
select * from board join member on board.mno = member.mno;
select * from board join member using(mno);
select * from board inner join member on board.mno = member.mno;

# 테이블명을 간소화 할때는 
select * from board b inner  join member m on b.mno = m.mno;

# 댓글 출력
select * from reply;
select * from reply r inner join member m on r.mno = m.mno where r.bno = 1;

# 조회수 증가 처리, 조회수 1증가, update 
