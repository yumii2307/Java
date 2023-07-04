###########################################################
#
# 테이블 조인(Table join)
#
###########################################################

/*
 * 1. 테이블 생성
 */
# song table
CREATE TABLE if NOT EXISTS song (
	sid int NOT NULL AUTO_INCREMENT,
	title varchar(32) NOT NULL,
	lyrics varchar(64),
	PRIMARY KEY (sid)
) AUTO_INCREMENT=101;

# girl_group table
CREATE TABLE if NOT EXISTS girl_group (
	gid int NOT NULL AUTO_INCREMENT,
	name varchar(32) NOT NULL,
	debut date NOT NULL,
	hit_song_id int,
	PRIMARY KEY (gid)
) AUTO_INCREMENT=1001;

/*
 * 2. 데이터 입력
 */
# Song table
INSERT INTO song (title, lyrics) 
	VALUES ('Tell Me', 'tell me tell me tetetete tel me'),
	('Gee', 'GEE GEE GEE GEE GEE BABY BABY'),
	('미스터', '이름이 뭐야 미스터'), 
	('Abracadabra', '이러다 미쳐 내가 여리여리'),
	('8282', 'Give me a call Baby baby'), ('기대해', '기대해'),
	('I Dont care', '다른 여자들의 다리를'), 
	('Bad Girl Good Girl', '앞에선 한 마디 말도'), ('피노키오', '뉴예삐오'),
	('별빛달빛', '너는 내 별빛 내 마음의 별빛'), 
	('A', 'A 워오우 워오우워 우우우'),
	('나혼자', '나 혼자 밥을 먹고 나 혼자 영화 보고'), ('LUV', '설레이나요'),
	('짧은치마', '짧은 치마를 입고 내가 길을 걸으면'),
	('위아래', '위 아래 위위 아래'), ('Dumb Dumb', '너 땜에 하루종일');

# girl_group table
INSERT INTO girl_group (name, debut, hit_song_id)
	VALUES ('원더걸스', '2007-02-10', 101),
	('소녀시대', '2007-08-02', 102), ('카라', '2009-07-30', 103),
	('브라운아이드걸스', '2008-01-17', 104), ('다비치', '2009-02-27', 105),
	('2NE1', '2009-07-08', 106), ('f(x)', '2011-04-20', 108),
	('시크릿', '2011-01-06', 109), ('레인보우', '2010-08-12', 110),
	('애프터 스쿨', '2009-11-25', 120), ('포미닛', '2009-08-28', 121);

/*
 * 3. Table join
 */
# INNER JOIN
SELECT `name`, debut, title, lyrics FROM song
	INNER JOIN girl_group
	ON song.sid = girl_group.hit_song_id;
	
# LEFT JOIN - song table에는 있고, girl_group table에는 없는 내용도 선택됨
SELECT `name`, debut, title, lyrics FROM song
	LEFT OUTER JOIN girl_group					# OUTER 생략 가능
	ON song.sid = girl_group.hit_song_id;
	
# RIGHT JOIN - song table에는 없고, girl_group table에는 있는 내용이 선택됨
SELECT `name`, debut, title, lyrics FROM song
	RIGHT OUTER JOIN girl_group
	ON song.sid = girl_group.hit_song_id;

# FULL OUTER JOIN - MySQL에서는 제공하지 않음
# LEFT JOIN 과 RIGHT JOIN 결과를 UNION (합집합)
SELECT `name`, debut, title, lyrics FROM song
	LEFT OUTER JOIN girl_group
	ON song.sid = girl_group.hit_song_id
UNION	
SELECT `name`, debut, title, lyrics FROM song
	RIGHT OUTER JOIN girl_group
	ON song.sid = girl_group.hit_song_id;

/*
 * 4. Table join
 */
# 2007년도에 데뷔한 걸그룹은?
SELECT * FROM girl_group
	WHERE debut BETWEEN DATE('2007-01-01') AND DATE('2007-12-31');

SELECT * FROM girl_group
	WHERE debut LIKE '2007%';
	
# 2009년도에 데뷔한 걸그룹의 히트송은?
# 걸그룹 이름, 데뷔일자, 히트송 제목
SELECT `name`, debut, title FROM girl_group
	INNER JOIN song
	ON girl_group.hit_song_id = song.sid
	WHERE debut LIKE '2009%';

# 데뷔일자가 빠른 5개 그룹의 히트송은?
# 걸그룹 이름, 데뷔일자, 히트송 제목
SELECT `name`, debut, title FROM girl_group
	INNER JOIN song
	ON girl_group.hit_song_id = song.sid
	ORDER BY debut
	LIMIT 5;
	
