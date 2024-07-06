drop database if exists day08;
create database day08;
use day08;

# 1. A테이블 
create table table1(
	num int,
    primary key (num)
);

# 2. B테이블 
create table table2(
	no int,
    num int,
    primary key (no),
    foreign key(num) references table1(num)
);

# 샘플
insert into table1 values(1), (2), (3), (4), (5);
insert into table2 values(1,1), (2,2), (3,1), (4,1), (5,2);

# 확인 
select * from table1;
select * from table2;

# 단일 테이블의 데이터 검색
select * from table1 where num = 1;
select * from table2 where num = 1;

# 2. 다중 테이블의 데이터 검색: 쉼표 이용한 테이블명 구분 

# 모든 레코드를 table1과 table2에서 조인하여 검색
# 이 쿼리는 두 테이블의 모든 가능한 조합(카테시안 곱)을 생성
# 결과는 table1의 레코드 수 * table2의 레코드 수
select * from table1, table2; 

# 모든 레코드를 table1과 table2에서 조인하여 검색
# 이 쿼리는 num 컬럼이 동일한 레코드들을 검색
# 두 테이블에 모두 num 컬럼이 있고, 값이 같은 경우에만 결과에 포함
select * from table1, table2 where num = num;

# 모든 레코드를 table1과 table2에서 조인하여 검색
# 이 쿼리는 table1의 num 컬럼과 table2의 num 컬럼이 같은 경우의 레코드들을 검색
# 두 테이블 간의 특정 컬럼 값을 기준으로 조인
select * from table1, table2 where table1.num = table2.num;

# 모든 레코드를 table1과 table2에서 조인하여 검색
# 이 쿼리는 테이블 별칭을 사용하여 간결하고 가독성 있는 쿼리를 작성
# a는 table1의 별칭, b는 table2의 별칭
# table1의 num 컬럼과 table2의 num 컬럼이 같은 경우의 레코드들을 검색
select * from table1 a, table2 b where a.num = b.num;

# 3. JOIN 절 
# 3-1 교집합 (INNER JOIN): 두 테이블에서 공통으로 일치하는 레코드만을 반환. pk-fk 교집합 찾기 
# [1] where 절 이용한 방법 
# 두 테이블을 쉼표로 구분하고 WHERE 절에서 조인 조건을 지정하여 두 테이블을 조인함.
select * from table1, table2 where table1.num = table2.num;
# [2] natural join
# 두 테이블에서 동일한 이름의 모든 열을 기준으로 조인함. 이 경우 num 필드가 공통임.
select * from table1 natural join table2;
# [3] 테이블명1 join 테이블명2 on 조인조건 
# 테이블명1 JOIN 테이블명2 ON 조인조건 형식으로 사용.
select * from table1 join table2 on table1.num = table2.num;
# [4] 테이블명1 join 테이블명2 using(필드명)
# 공통된 필드 이름을 using 절에 지정하여 조인함.
select * from table1 join table2 using(num);
# [5] 테이블명1 inner join 테이블명2 on 조인조건 
# INNER JOIN을 명시적으로 사용하여 두 테이블을 조인함.
select * from table1 inner join table2 on table1.num = table2.num;

