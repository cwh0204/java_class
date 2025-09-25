/* customer_pro 저장 프로시저 생성 */
create or replace procedure customer_pro
-- or replace 옵션은 재생성
(
    cusname out customer.cus_name%type, --cusname 변수는 customer 테이블의 cus_name 컬럼 타입으로 지정된다.
    --out 모드 매개변수는 컬럼에 저장된 레코드값을 되돌려 받을때 사용
    cusphone out customer.cus_phone%type,
    cusemail out customer.cus_email%type,
    cusno in customer.cus_no%type --in모드 매개변수는 값을 입력받을때 사용 -> 고객번호를 입력받는다.
)
is
begin
    select cus_name, cus_phone, cus_email into cusname, cusphone, cusemail
    from customer where cus_no=cusno;
    --입력받은 고객번호를 기준으로 오라클 해당테이블로 부터 고객이름, 폰번호, 이메일을 검색해서 cusname,cusphone,cusemail
    --각 변수에 저장한다.
end;

commit;