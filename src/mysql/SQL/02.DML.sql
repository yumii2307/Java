###########################################################
#
# 데이터 조작 언어(DML: Data Manipulation Language)
#
###########################################################

/*
 * 2. Update
 * 
 * UPDATE 테이블명
   		SET 필드명 = 값[, 필드명=값, 필드명=값, ...]
   		WHERE 조건;
 */
# 제주시 이름 변경
UPDATE city
	SET `Name` = 'Jeju', District = 'Jeju' WHERE ID = 2358;

/*
 * 3. Insert
 * 
 * INSERT INTO 테이블명 [(필드명)]
   		VALUES (필드값)[, (필드값), ...]
 */
# 강원도 속초시 추가
INSERT INTO city(`Name`, countrycode, district)
	VALUES ('Sokcho', 'KOR', 'Kang-won');

INSERT INTO city		# 필드명 생략(DEFAULT), auto_increment 속성을 갖더라도 임의의 값 부여 가능
	VALUES (DEFAULT, 'Sokcho', 'KOR', 'Kang-won', 100000);

# 여러건의 데이터 입력
INSERT INTO city VALUES
	(DEFAULT, 'Sokcho', 'KOR', 'Kang-won', 100000),
	(DEFAULT, 'Hawseong', 'KOR', 'Kyonggi', 500000);
	
# 대량 데이터 삽입
# 국내 도시만으로 된 새로운 테이블을 만드는 경우
CREATE TABLE if NOT EXISTS KoreanCity LIKE city;
INSERT INTO koreanCity
	SELECT * FROM city WHERE countrycode='KOR';

/*
 * 4. Delete
 * 
 * DELETE FROM 테이블명 WHERE 조건;
 */
DELETE FROM koreancity WHERE id = 4080;
DELETE FROM city WHERE id BETWEEN 4080 AND 4082;

