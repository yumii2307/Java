###########################################################
#
# 날짜/시간 조작
#
###########################################################

/*
 * 1. 테이블 생성
 */
CREATE TABLE if NOT EXISTS dateTable (
	ID INT PRIMARY KEY AUTO_INCREMENT,
	`DATE` DATE DEFAULT (CURRENT_DATE),
	`DATE_TIME` DATETIME DEFAULT (CURRENT_TIMESTAMP)
);

/*
 * 2. 데이터 입력
 */
INSERT INTO datetable VALUES(DEFAULT, DEFAULT, DEFAULT);
INSERT INTO datetable(id) VALUES(DEFAULT)
INSERT INTO datetable (`date`, `date_time`) VALUES
	('2023-03-08', '2023-03-08 11:25:00'),
	('2023-12-24', '2023-12-24 20:00:00');
	
/*
 * 3. 데이터 조회
 */
# 2023-07-04 형식
SELECT `date`, DATE_FORMAT(`date_time`, '%Y-%m-%d') FROM datetable;

# 11:25:00 AM 형식
SELECT DATE_FORMAT(`date_time`, '%h:%i:%s %p') FROM datetable;
SELECT DATE_FORMAT(`date_time`, '%r') FROM datetable;

# 23-07-04 11:25 형식
SELECT DATE_FORMAT(`date_time`, '%y-%m-%d %H:%i') AS modTime
	FROM datetable;

# 날짜 조회 함수
SELECT NOW(), CURDATE(), CURTIME();

# 날짜 더하기/빼기 - 오늘로부터 40일 이후/3달 전
SELECT DATE_ADD(NOW(), INTERVAL 40 DAY);
SELECT DATE_SUB(NOW(), INTERVAL 3 MONTH);

# D-DAY 계산
SELECT TO_DAYS('2023-12-25') - TO_DAYS(NOW());

# 요일: 1 - 일요일
SELECT DAYOFWEEK(`date_time`) FROM datetable;
