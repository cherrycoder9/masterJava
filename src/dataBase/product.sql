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