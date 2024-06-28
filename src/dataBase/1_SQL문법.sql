# 테이블/표 관련
/*
	# 테이블/표 관련
    관련 용어
    파일 관점에서 보면 폴더는 데이터베이스
    데이터베이스 모델링 기준으로 보면 엔티티
    관계형 데이터베이스 관점에서는 테이블 또는 릴레이션
    
    [ 관점 차이에 따라 용어가 다를 수 있다 ]
    파일 시스템			데이터베이스 모델링			관계형 데이터베이스
    파일 				엔티티					테이블, 릴레이션
    레코드 			튜플 						행
    필드 				속성						열 
    
    - MYSQL 데이터 타입
    [ 정수 ]
		1. TINYINT		1바이트		-128 ~ +127
        2. SMALLINT		2바이트		+- 3만 정도 
        3. MEDIUM		3바이트		+- 800만정도 
        4. INT			4바이트 		+- 20억 정도
        5. BIGINT		8바이트		+- 20억 이상 
	[ 실수: 부동소수점, 오차발생 ] 
		1. FLOAT		4바이트 
        2. DOUBLE 		8바이트 
	[ 문자 형태로 저장되는 숫자 ]
		1. DECIMAL		: 실수를 오차 없이 표현할 때 사용 
	[ 날짜 ]
		1. DATE			: 1000년 ~ 9999년 
        2. DATETIME		: 날짜와 시간 표현
	[ 문자 ]
		1. CHAR(문자길이)			: 고정길이, 1~255 문자
			CHAR(5)				유재석 --> [유] [재] [석] [] []
        2. VARCHAR(문자길이)		: 가변길이, 1~255 문자
			VARCHAR(5)			유재석 --> [유] [재] [석]
        3. TEXT 				: 최대길이 6만개 글자 표현  
        4. LONGTEXT				: 최대길이 4GB (42억개 글자 표현)
    
    1. 테이블(table): 표, 릴레이션(relation)
    2. 레코드(record): 튜플(tuple), 행(row),
    3. 필드(field): 속성(attribute), 열(column)
    
    
*/

use mydb;
# 테이블 생성 (어디에 테이블을 만들건지, 어떤 데이터베이스에 테이블을 생성할건지 생각)
# create table 테이블명(열이름1 타입, 열이름2, 타입)
create table 회원목록(이름 text, 점수 int);

# 2.
show tables;

# 3.
drop table if exists 회원목록;

# 예1
drop database if exists sqlweb1;
create database sqlweb1;
use sqlweb1;
drop table if exists member;
create table member(id varchar(20), password varchar(20), age int, joinDate date);
show tables;
select * from member; # 테이블 확인 

#예2
drop table if exists board;
create table board(
	bno int,				-- 번호 (정수) 
    title varchar(100), 	-- 제목 (최대 100글자)
    content longtext, 		-- 내용 (긴글 최대 4G)
    view int,				-- 조회수 (정수)
    date datetime			-- 작성일 (날짜와 시간)
);
show tables;
select * from board;

# 예3 
drop table if exists student;
create table student(
	정수1 tinyint,
    정수2 smallint,
    정수3 mediumint,
    정수4 int,
    정수5 bigint,
    실수1 float,
    실수2 double,
    실수3 decimal,
    날짜 date,
    날짜시간 datetime,
    문자열1 char(100),
    문자열2 varchar(100),
    문자열3 text,
    문자열4 longtext,
    논리 bool
);
show tables;
select * from student;

# 실습1
/*
	키오스크 개발의 메모리 설계
	[요구사항] 
		1. 여러개 카테고리를 선택을 해서 카테고리 별로 제품들을 출력/확인 
        2. 해당 제품을 선택해서 수량 입력받아 주문처리, 단) 하나의 주문에 여러개 제품을 주문할 수 있다.
        3. 주문번호를 받아서 대기한다. 
	
    [메모리 설계 필수 속성]
		각 식별자코드들, 카테고리명, 가격, 제품명, 주문수량, 주문날짜
*/

-- 테이블 삭제 (존재할 경우)
DROP TABLE IF EXISTS 카테고리;
DROP TABLE IF EXISTS 제품;
DROP TABLE IF EXISTS 주문;
DROP TABLE IF EXISTS 주문상세;

-- 새로운 테이블 생성
CREATE TABLE 카테고리 (
    카테고리코드 INT,
    카테고리명 VARCHAR(20)
);
CREATE TABLE 제품 (
    제품코드 INT,
    제품명 VARCHAR(20),
    가격 INT,
    카테고리코드 INT
);
CREATE TABLE 주문 (
    주문코드 INT,
    주문날짜 DATETIME
);
CREATE TABLE 주문상세 (
    주문상세코드 INT,
    제품코드 INT,
    수량 INT,
    주문코드 INT
);

-- 테이블 목록 확인
SHOW TABLES;
-- 카테고리 테이블 데이터 확인
SELECT * FROM 카테고리;
-- 제품 테이블 데이터 확인
SELECT * FROM 제품;
-- 주문 테이블 데이터 확인
SELECT * FROM 주문;
-- 주문상세 테이블 데이터 확인
SELECT * FROM 주문상세;