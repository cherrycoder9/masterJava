-- 한줄 주석
# 한줄 주석
/* 여러줄 주석 */

/*
	SQL 질의어
    
    [주의할점]
    SQL 문장을 입력후 세미콜론으로 끝내야 함 
    문자처리 ' ' 혹은 " "
    명령어/키워드에서는 대소문자 구분을 안함
    데이터/자료는 구분함 
    
    [실행]
    명령어 단위로 실행이 있고 전체 실행이 있음 
    명령어 단위 실행: 실행 명령어에 커서 두고 컨트롤+엔터 또는 상단에 번개모양에 커서붙어 있는것 클릭
    전체 명령어 실행: 상단 번개모양의 I 없는 번개 모양 
    DDL(Data Definition Language): 데이터 정의어 
    create
		- create database 새로운DB명;		// 데이터베이스 생성 
        - create table 새로운T명();		// 테이블 생성 
    drop
		- drop database 삭제할DB명;		// 데이터베이스 삭제 
        - drop database if exists 삭제할DB명;
        - drop table 삭제할T명;
        - drop table  if exists 삭제할T명;
	그외
		- show databases; // 서버 내 데이터베이스 목록 확인 
        - show variables like "datadir"; // 서버내 데이터베이스 로컬 위치를 알려줌 
	use 
		- use 사용할데이터베이스명; // DB 서버 내 조작/사용할 데이터베이스 선택 
    
    DML(Data Manipulation Language) : 데이터 조작어  
    DCL(Data Control Language): 데이터 제어어 
    
    [명령 실행 결과 ]
    하단에 results 창에 나옴 
*/
# 현재 DB Server에 존재하는 데이터베이스 확인
show databases;

# 현재 DB Server 존재하는 로컬 드라이브 위치 확인 
show variables like "datadir";

# 현재 DB Server 내 데이터베이스 생성 
create database myDB;

# 데이터베이스 삭제
drop database mydb;

# 만약에 해당 데이터베이스 존재하면 삭제
drop database if exists mydb;

# DB 서버에는 여러개의 데이터베이스 존재 
use mydb;

# 실습1 
# test2 이름의 데이터베이스가 존재하면 삭제하기 
drop database if exists test2;
# test2 이름의 데이터베이스 생성하기 
create database test2;
# 데이터베이스 목록 확인 
show databases;
# 로컬PC에 데이터베이스가 만들어졌는지 확인하기 
show variables like "datadir";
# test2 데이터베이스 사용 활성화하기 
use test2;