-- 데이터베이스 생성 및 선택
drop database if exists day09;
create database day09;
use day09;

-- 1. 회원테이블 (아이돌 그룹 정보)
drop table if exists member;
create table member(
   mid char(8) not null,         -- 식별키 (그룹 ID), 최대 8자리
   mname varchar(10) not null,   -- 그룹명, 최대 10자리
   mnumber int not null,         -- 인원수, 정수 (약 +-21억 범위)
   maddr char(2) not null,       -- 지역, 최대 2자리
   mphone1 char(3),              -- 지역번호, 최대 3자리 (주석 수정: 2자리 -> 3자리)
   mphone2 char(8),              -- 전화번호, 최대 8자리
   mheight smallint,             -- 평균키, 정수 (약 +-3만 범위)
   mdebut date,                  -- 데뷔일, yyyy-mm-dd 형식
   primary key (mid)             -- 기본키 설정
);

-- 2. 구매테이블
drop table if exists buy;
create table buy(
   bnum int auto_increment,      -- 구매번호, 자동 증가
   mid char(8),                  -- 구매자 (외래키)
   bpname char(6) not null,      -- 제품명, 최대 6자리
   bgname char(4),               -- 분류명, 최대 4자리
   bprice int not null,          -- 가격, 정수
   bamout smallint not null,     -- 구매수량, 정수
   primary key(bnum),            -- 기본키 설정
   foreign key (mid) references member(mid)  -- 외래키 설정
);

-- 샘플 데이터 삽입
-- member 테이블에 데이터 삽입
INSERT INTO member VALUES('TWC', '트와이스', 9, '서울', '02', '11111111', 167, '2015-10-19');
-- 나머지 INSERT 문은 동일한 형식으로 계속됩니다...

-- buy 테이블에 데이터 삽입
INSERT INTO buy VALUES(NULL, 'BLK', '지갑', NULL, 30, 2);
-- 나머지 INSERT 문은 동일한 형식으로 계속됩니다...

-- 1. 테이블 조회
select * from member;  -- member 테이블의 모든 데이터 조회
select * from buy;     -- buy 테이블의 모든 데이터 조회

-- 2. 특정 필드만 표시해서 테이블 조회 
select mid from member;  -- member 테이블에서 mid 필드만 조회
select mid, mname from member;  -- member 테이블에서 mid와 mname 필드 조회

-- 3. 별칭(alias) 사용 (검색결과의 필드명을 설정)
select mid as a1 from member;  -- mid 필드를 a1이라는 별칭으로 조회
select mid a1 from member m;   -- 테이블에도 별칭(m) 사용 가능

-- 4. 조건절 [where 조건식] 사용 예제
select * from member where mname = '블랙핑크';  -- mname이 '블랙핑크'인 레코드 검색
select * from member where mnumber = 4;  -- mnumber가 4인 레코드 검색
select * from member where mheight <= 162;  -- mheight가 162 이하인 레코드 검색
select * from member where mheight >= 165 and mheight <= 170;  -- 키가 165 이상 170 이하인 레코드 검색
select * from member where mheight between 165 and 170;  -- 위와 동일한 결과
select * from member where mheight >= 165 or mnumber > 6;  -- 키가 165 이상이거나 인원이 6명 초과인 레코드 검색
select * from member where maddr in('경기', '전남', '경남');  -- maddr이 '경기', '전남', '경남' 중 하나인 레코드 검색
select * from member where maddr not in('경기', '전남', '경남');  -- maddr이 '경기', '전남', '경남'이 아닌 레코드 검색
select * from member where mname != '에이핑크';  -- mname이 '에이핑크'가 아닌 레코드 검색
select * from member where mname like '에이%';  -- mname이 '에이'로 시작하는 레코드 검색
select * from member where mname like '%핑크';  -- mname이 '핑크'로 끝나는 레코드 검색
select * from member where mname like '%이%';  -- mname에 '이'가 포함된 레코드 검색
select * from member where mname like '에이_';  -- mname이 '에이'로 시작하는 3글자 레코드 검색 (결과 없음)
select * from member where mname like '__핑크';  -- mname이 '핑크'로 끝나는 4글자 레코드 검색
select * from member where mnumber >= 1 + 1;  -- mnumber가 2 이상인 레코드 검색

-- 산술 연산 예제
select mnumber + 3 더하기, mnumber - 3 빼기, mnumber * 3 곱하기, 
       mnumber / 3 나누기, mnumber div 3 몫, mnumber mod 3 나머지 
from member;

select mid, mnumber * 100 as 새로운필드 from member;  -- 연산 결과를 새로운 필드로 조회

-- NULL 값 처리
select * from member where mphone1 = '';  -- 빈 문자열 검색
select * from member where mphone1 = ' ';  -- 공백 문자 검색
select * from member where mphone1 is null;  -- NULL 값 검색
select * from member where mphone1 is not null;  -- NULL이 아닌 값 검색

/*
SQL 연산자 요약:
1. 산술 연산자: +, -, *, /, div(몫), mod(나머지)
2. 비교 연산자: =, !=, <, <=, >, >=
3. 논리 연산자: AND, OR, NOT
4. 기타 연산자:
   - BETWEEN: 범위 검색
   - IN: 여러 값 중 하나와 일치
   - LIKE: 패턴 매칭 (%, _)
   - IS NULL / IS NOT NULL: NULL 값 처리
참고: SQL에는 복합 대입 연산자(+=, -=, 등)나 증감 연산자(++, --)가 없습니다.
*/

-- 5. 조회 결과의 레코드를 필드 기준으로 정렬
-- ORDER BY 구문 사용법:
-- ORDER BY 필드명 [ASC]: 오름차순 정렬 (기본값, ASC는 생략 가능)
-- ORDER BY 필드명 DESC: 내림차순 정렬

-- 데뷔일(mdebut) 기준으로 정렬
select * from member order by mdebut;        -- 오름차순 정렬 (과거 -> 최근)
select * from member order by mdebut asc;    -- 위와 동일 (asc는 생략 가능)
select * from member order by mdebut desc;   -- 내림차순 정렬 (최근 -> 과거)

-- 정렬 기준이 여러 개인 경우
-- 첫 번째 정렬 기준으로 정렬 후, 값이 같은 경우 두 번째 기준으로 정렬
select * from member order by maddr desc, mdebut asc;
-- 지역(maddr)을 내림차순으로 정렬하고, 같은 지역 내에서는 데뷔일(mdebut)을 오름차순으로 정렬

-- 6. 조회 결과 레코드 수 제한 (LIMIT 사용)
-- LIMIT 구문 사용법:
-- LIMIT 레코드수: 처음부터 지정된 개수만큼 출력
-- LIMIT 시작위치, 개수: 시작 위치부터 지정된 개수만큼 출력 (시작 위치는 0부터 시작)

select * from member limit 2;        -- 처음부터 2개의 레코드만 출력
select * from member limit 0, 3;     -- 첫 번째 레코드부터 3개 출력 (LIMIT 3과 동일)
select * from member limit 1, 2;     -- 두 번째 레코드부터 2개 출력

-- ORDER BY와 LIMIT 조합 사용
select * from member order by mheight desc limit 3;
-- 키(mheight)를 기준으로 내림차순 정렬 후, 상위 3개 레코드만 출력 (키가 가장 큰 3명 출력)

-- 추가 예제: 페이지네이션 구현
-- 한 페이지에 5개씩 출력할 때, 2번째 페이지 데이터 조회
select * from member order by mid limit 5, 5;
-- mid 기준 정렬 후, 6번째 레코드부터 5개 출력 (2번째 페이지에 해당)

-- 주의사항:
-- 1. ORDER BY는 성능에 영향을 줄 수 있으므로, 대용량 데이터에서는 인덱스 사용을 고려해야함
-- 2. LIMIT은 대량의 데이터를 다룰 때 유용하지만, offset이 큰 경우 성능 저하가 발생할 수 있음
-- 3. ORDER BY와 LIMIT을 함께 사용할 때, ORDER BY가 먼저 실행된 후 LIMIT이 적용됨 

-- 7. 검색된 필드의 중복 제거
select maddr from member; -- 모든 주소 검색
select distinct maddr from member; -- 모든 주소에서 중복 제거 검색

-- select에서 where절, order절, limit절 동시에 작성 시 순서 존재
-- select 필드명 from 테이블명 where 조건절 order by 필드명 [정렬기준] limit 제한수
select * from member where mheight >= 160 order by maddr desc limit 3;
