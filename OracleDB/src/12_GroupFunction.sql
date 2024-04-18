-- 12_GroupFunction.sql

-- 테이블내의 하나의 필드값을 전체로 하는 함수

-- 합계 (SUM)
SELECT SUM(inprice)as "입고가격합계" FROM booklist;
SELECT SUM(rentprice)as "대여가격합계" FROM booklist WHERE inprice>=18000;


-- 갯수( COUNT )
SELECT COUNT(*)AS"회원수" FROM memberlist; 
SELECT COUNT(*)AS"회원수" FROM memberlist WHERE bpoint>=100;

-- 평균 (AVG)
SELECT ROUND(AVG(inprice),0 )AS"입고가격평균" FROM booklist;
-- TO_CHAR 로 변경된 숫자는 문자로 변경된 것이므로 명령실행이후 숫자로서의 기능이 상실됩니다. 다른 숫자와 계산불가
SELECT TO_CHAR(AVG(inprice),'999,999,999')AS"입고가격평균"FROM booklist;

-- MAX : 최대값
-- SEQUENCE 에 의해서 방금 추가된 자동 증가번호를 조회할때 많이 사용합니다
SELECT MAX(inprice)FROM booklist

-- MIN : 최소값
SELECT MIN(inprice)FROM booklist


-- GROUB BY
-- 그룹함수의 결과들을 다른 필드의 그룹으로 재구성
SELECT COUNT(*) AS"총대여건수"FROM rentlist;

-- 도서별 대여건수
SELECT bnum as "도서번호", COUNT(*) AS"도서별 대여건수", SUM(discount) AS"할인금액합계"
FROM rentlist GROUP BY bnum;

-- RENTLIST 테이블에서 대여일자(RENTDATE)별 대여건수와 할인금액 평균
SELECT rentdate AS 대여일자 , COUNT(*) AS 대여건수
FROM rentlist GROUP BY rentdate ORDER BY rentdate DESC;


-- HAVING
-- 그룹핑된 내용들에 조건을 붙일때
SELECT RENTDATE AS 대여일자, COUNT(*) AS 대여건수, AVG(discount) AS 할인금액평균
FROM rentlist
GROUP BY rentdate
HAVING AVG(discount)>=150
ORDER BY rentdate DESC;