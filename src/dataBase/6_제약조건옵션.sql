drop database if exists day07;
create database day07;
use day07;

create table table1(
	mno_pk int,
    primary key(mno_pk)
);

create table table2(
	bno_pk int,
    mno_fk int,
    primary key(bno_pk),
    foreign key(mno_fk) references table1(mno_pk) 
    # on delete restrict
    # on delete cascade
    on delete set null
    # on update restrict
    on update cascade
);

# 샘플
insert into table1 values(1),(2),(3),(4),(5);
insert into table2 values(1,1),(2,1),(3,2),(4,2),(5,3);

# delete from table1 where mno_pk= 1; -- 삭제할 pk가 참조당하는 중이라 삭제 안됨 
# delete from table1 where mno_pk=4; -- 해당 pk값이 다른 테이블에 존재하지 않아 삭제 가능 

update table1 set mno_pk = 6 where mno_pk = 1; -- 회원번호가 '1'인 pk값을 '6'으로 수정 

select * from table1;
select * from table2;

# 제약조건 옵션 
# foreign key( ) references 테이블명() on delete restrict -- 기본값 
# 1. on delete restrict: (기본값) pk-fk 데이터가 서로 참조하고 있는 데이터/개체가 존재하면 pk 삭제 불가능 (기본값) 
# 2. on delete cascade: pk-fk 데이터가 서로 참조하고 있는 데이터/개체가 존재하면 pk-fk 같이 삭제 
# 3. on delete set null: pk-fk 데이터가 서로 참조하고 있는 데이터/개체가 존재하면 pk 삭제시 fk는 null로 변경
# 4. on update restrict:                                    ...                                         pk 수정 불가능 (기본값)
# 5. on update cascade:                                  ...                                         pk-fk 같이 수정됨 
# 6. on update set null:                                    ...                                         pk 수정시 fk는 null 대입/변경

