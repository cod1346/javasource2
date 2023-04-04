-- javadb

-- userTBL 테이블 생성
-- no(번호-숫자(4)), username(이름-한글(4)), birthYear(년도-숫자(4)), addr(주소-문자(한글,숫자)), mobile(010-1234-1234)
-- no pk 제약조건 지정(제약조건명 pk_userTBL)

create table userTBL(
    no number(4) CONSTRAINT pk_userTBL PRIMARY KEY,
    username NVARCHAR2(10) not null,  -- varchar2(20)
    birthYear number(4) not null,
    addr nvarchar2(50) not null,      -- varchar2(50)
    mobile nvarchar2(20));            -- varchar2(20)

drop table userTBL;

-- 시퀀스 생성
-- user_seq 생성(기본)

create sequence user_seq;


-- insert
-- no : user_seq 값 넣기
INSERT INTO userTBL(no, username, birthYear, addr, mobile)
VALUES(user_seq.NEXTVAL, '홍길동', 2010, '서울시 종로구 123', '010-1234-5678');

commit;

-- 모든 컬럼 not null

-- paytype : pay_no(숫자-1 pk), info(문자-card, cash)
-- paytype_seq 생성

CREATE TABLE paytype(
    pay_no number(1) PRIMARY KEY,
    info varchar2(10) not null);

CREATE SEQUENCE paytype_seq;

INSERT INTO paytype values(paytype_seq.NEXTVAL, 'card');
INSERT INTO paytype values(paytype_seq.NEXTVAL, 'cash');

SELECT * FROM paytype; -- 1 : card, 2 : cash

-- suser : user_id(숫자-4 pk) , name(문자-한글), pay_no(숫자-1 : paytype 테이블에 있는 pay_no 참조 해서 사용)
CREATE TABLE suser(
    user_id number(4) PRIMARY KEY,
    name varchar2(20) NOT NULL,
    pay_no number(1) NOT NULL references paytype(pay_no));
    
select * from suser;

-- product
-- product_id(숫자-8 pk), pname(문자), price(숫자), content(문자)
CREATE TABLE product(
    product_id number(8) PRIMARY KEY,
    pname varchar2(30) NOT NULL,
    price number(8) NOT NULL,
    content varchar2(50) NOT NULL);
    
CREATE SEQUENCE product_seq;

insert into product values(1001,'배',20000000,'영광');


-- sorder
-- order_id(숫자-8 pk), user_id(user 테이블의 user_id 참조), product_id(product 테이블의 product_id 참조)
-- order_seq 생성

CREATE TABLE sorder(
    order_id number(8) PRIMARY KEY,
    user_id number(4) NOT NULL REFERENCES suser(user_id),
    product_id number(8) NOT NULL REFERENCES product(product_id)
);

CREATE SEQUENCE order_seq;

-- user_id, name, pay_no, info 조회
-- suser와 paytype join

SELECT u.user_id, u.name, u.pay_no, p.info
FROM suser u, paytype p
WHERE u.pay_no = p.pay_no AND u.user_id=1000;

-- 주문정보 전체 조회
SELECT * FROM sorder;

-- 주문목록 조회
-- user_id, name, card/cash, product_id, pname, price, content

-- 기준 : sorder
-- suser 테이블 : name,
-- paytype 테이블 : card/cash
-- product 테이블 : product_id, pname, price, content

-- 전체 주문목록
SELECT s.user_id, u.name, t.info, s.product_id, p.pname, p.price, p.content, s.order_date
FROM sorder s, suser u, paytype t, product p
WHERE s.user_id = u.user_id AND u.pay_no = t.pay_no AND s.product_id = p.product_id
;


-- 홍길동 주문목록 조회
SELECT s.user_id, u.name, t.info, s.product_id, p.pname, p.price, p.content, s.order_date
FROM sorder s, suser u, paytype t, product p
WHERE s.user_id = u.user_id AND u.pay_no = t.pay_no AND s.product_id = p.product_id AND s.user_id = 1001;


insert into sorder values(order_seq.nextval,1001,1001,sysdate);







select * from product;




