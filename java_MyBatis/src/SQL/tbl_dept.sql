
create table tbl_dept(
    deptno number(38) primary key,
    dname varchar2(100),
    LOC varchar2(200)
);

insert into tbl_dept values(11, '개발부', '대전광역시');
insert into tbl_dept values(12, '데이터베이스부', '경기도 판교');

select * from tbl_dept order by deptno asc; --부서번호를 기준으로 오름차순 정렬(asc -> 생략가능)하면 작은 숫자 부서번호 부터 정렬된다.
