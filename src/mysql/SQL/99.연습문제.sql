# 대륙별로 국가숫자, GNP의 합, 평균 국가별 GNP는?

SELECT continent, COUNT(*) AS COUNT, 
	round(sum(gnp)) AS GNP, 
	round(SUM(gnp) / COUNT(8)) as avgGNP 
	FROM country
	GROUP BY continent;
	
# 아시아 대륙에서 인구가 가장 많은 도시 10개를 내림차순으로 보여줄 것
# 대륙명, 국가명, 도시명, 인구수

SELECT continent, country.Name, city.Name, city.Population FROM country
	INNER JOIN city
	ON country.Code = city.CountryCode
	WHERE continent='Asia'
	ORDER BY city.population DESC
	LIMIT 10;

# 전 세계에서 인구가 가장 많은 10개 도시에서 사용하는 공식언어는?
# 도시명, 인구수, 언어명

SELECT city.Name, city.Population, `Language` FROM country
	INNER JOIN city
	ON country.Code = city.CountryCode
	INNER JOIN countrylanguage
	ON country.Code = countrylanguage.CountryCode
	WHERE IsOfficial='T'
	ORDER BY city.population DESC
	LIMIT 10;