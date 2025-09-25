--오라클 한줄 주석문 기호
/*
    오라클 한줄 주석문 기호
*/
CREATE TABLE customer( -- 커스터머 테이블 생성
    cus_no NUMBER(38) PRIMARY KEY --고객번호 CUS_NO는 컬럼명 즉 필드명이라고 한다 이컬럼명에 최종 자료가 저장된다.
    --컬럼에 저장된 한행의 자료집합을 레코드 라고한다.
    ,cus_name varchar2(50) not null --고객이름
    ,cus_phone varchar2(30) not null --고객 폰번호
    ,cus_email varchar2(100) not null --고객 이메일
    ,cus_date date default sysdate --고객 등록날짜 default sysdate 제약조건을 주면 cus_date 컬럼에 굳이 레코드 저장시 
    --등록날짜를 insert 하지 않아도 기본 날짜값이 저장된다.
);


/*
    오라클 자료형 종류;
    1.number(38) : 최대자리수 38자까지 정수 숫자값을 저장되게 하는 정수숫자 타입이다.
    2. varchar2는 가변문자 타입
    3. date 는 날짜 타입
    
    제약조건이랑 테이블 컬럼에 레코드 저장시 어떤 제한을 가하는 것을 말한다.
    
    제약조건 종류)
    1. primary key(기본키 제약조건) : 이 제약조건은 중복 레코드 저장금지, null 저장 금지
    2. not null : null 저장금지, 중복레코드는 저장할 수 있다.
    
*/

select * from customer; --customer 테이블의 모든 컬럼(*) 레코드 데이터를 확인하는 sql문이다. *는 모든 컬럼을 의미한다.

/*  레코드 저장문인 insert문 형식
    insert into 테이블명 (컬럼목록) values(값);
    테이블의 모든 컬럼에 레코드 저장시에는 컬럼목록을 생략해도 된다. 하지만 원하는 컬럼에만 레코드를 저장할 때는 컬럼목록을 명시해야 한다.
    컬럼목록 순서와 values(값) 순서목록이 일치해야 한다.
    문자열 레코드 저장시에는 ' '(작은따옴표)로 감싸야 한다.
    
    SQL문은 영문대소문자를 구분하지 않는다. 하지만 컬럼에 저장되는 영문 레코드는 대소문자를 구분한다.
    
    시퀀스란? 번호 발생기이다. 주로 고객번호나 게시판 번호 등 정수 숫자 번호값 발생용도로 사용한다.
    시퀀스 특징)
        1. 시퀀스 번호는 중복 번호가 없고 NULL이 없다, 그러므로 primart key(기본키) 제약조건으로 설정되고 정수숫자 타입으로 지정된 컬럼 레코드값
        저장용도로 사용해야 한다.
        
        시퀀스 생성문법 형식)
        create sequence 시퀀스명
        start with 1 --1부터 시작, 기본값으로 생략가능
        increment by 1 --1씩 증가, 기본값으로 생략가능
        nocache -- 임시메모리를 사용하지 않겠다는 의미, 생략하면 기본값은 cache 20이다. 이것의 의미는 오라클에서 시쿼스 번호를 미리 20개까지 메모리에
        -- 올려 놓겠다는 뜻이다. 어제 마지막으로 발급된 시퀀스 번호가 100이라면 캐시에 101~120까지의 메모리에 있고, 다음 시퀀스 번호값은 121부터 시작 된다
        -- 오늘 db가 재시작하면 캐시값은 초기화가 된다.
        nocycle --시퀀스 최대값 또는 최소값에 도달하면 다시 처음부터 시퀀스 번호값을 반복하지 않겠다는 의미이다. 기본값으로 생략가능.
*/

--cus_no 시퀀스 생성
create sequence cus_seq
start with 1
increment by 1
nocache
nocycle;

--cus_seq 다음 시퀀스 번호값 확인 -> 시퀀스이름.nextval
select cus_seq.nextval as "다음시퀀스번호" from dual;

--sysdate는 오라클 날짜함수이다. 오늘 날짜시간값 확인

select sysdate as "오늘날짜" from dual;

--2개 레코드 저장
insert into customer (cus_no,cus_name,cus_phone,cus_email)  values (cus_seq.nextval,'홍길동','010-9999-9999','hong@naver.com');
insert into customer(cus_no,cus_name,cus_phone,cus_email) values(cus_seq.nextval,'이순신','010-9998-9998','lee@naver.com');

select * from customer;

/*
    레코드 검색 쿼리문 문법형식)
    select 컬럼목록(전체컬럼은 * ) from 테이블명 where 조건식 order by 기준컬럼 desc(asc);
    
    order by 는 정렬문이다.
    1.desc는 내림차순 정렬을 한다.
    2.내림차순 정렬 규칙)
        한글은 가나다 역순, 영어는 알파벳 역순, 숫자는 큰숫자 부터 먼저 정렬된다.
        
        오름차순 정렬문은 asc문이다. 기본값으로 생략가능하다. 오름차순 정렬은 내림차순 정렬의 역순이다.
        
        
*/
-- 고객번호를 기준으로 내림차순 정렬

select * from customer order by cus_no desc;

/*
    레코드 수정문 문법 형식)
        update 테이블명
        set 컬럼명 = 수정할 값, 컬럼명=수정할 값 ..
        where 조건식;
*/

update customer
set
    cus_name = '수정이순신',
    cus_email = 'editlee@naver.com'
where
    cus_no = 4;
    
select * from customer where cus_no=4;

--삭제할 레코드 하나 저장
insert into customer (cus_no,cus_name,cus_phone,cus_email) values (cus_seq.nextval,'삭제할이름','010-5555-5555','def@nate.com');

/*
    레코드 삭제 sql문인 delete문 문법 형식)
*/
delete from customer
where cus_no = 5;

select * from customer;

-- tbl_border 테이블 생성 설계

CREATE TABLE tbl_board(
    bno number(38) primary key,
    bname varchar2(200) not null,
    btitle varchar2(200) not null,
    bcont varchar2(4000) not null,
    bdate date
);

select * from tbl_board order by bno desc;

commit;

--bno_seq 시퀀스 생성

create sequence bno_seq
start with 1
increment by 1
NOCACHE
nocycle;

select bno_seq.nextval as "다음시퀀스번호" from dual;

commit;