/**/
CREATE TABLE tbl_guestbook (
    gno NUMBER(38) PRIMARY KEY,
    gname VARCHAR2(50) NOT NULL,
    gtitle VARCHAR2(200) NOT NULL,
    gcont VARCHAR2(4000) NOT NULL,
    gdate DATE
);
COMMIT;

create sequence gno_seq
start with 1
increment by 1
nocache
nocycle;

SELECT * from tbl_guestbook;

insert into tbl_guestbook 
(
    gno,
    gname,
    gtitle,
    gcont,
    gdate 
) 
VALUES(
    gno_seq.NEXTVAL ,
    '노인',
    ' 노인과바다',
    '바다에서 낚시를함',
    sysdate
)
commit;

UPDATE tbl_guestbook SET GNAME  = '노인1',GTITLE = '노인1',GCONT = '노인1' WHERE  GNO = 1;

DELETE from tbl_guestbook where gno = '1';

commit;
