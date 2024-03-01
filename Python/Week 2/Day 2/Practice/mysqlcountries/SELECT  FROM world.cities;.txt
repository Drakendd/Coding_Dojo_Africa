SELECT * FROM world.cities;
SELECT * FROM world.countries;
SELECT  countries.name  ,languages.language,languages.percentage
FROM countries
JOIN languages 
ON  languages.country_id=countries.id
WHERE languages.language= 'slovene'
ORDER BY languages.percentage DESC; 
-- 2
SELECT countries.name ,COUNT(cities.id) as cities
FROM cities 
JOIN countries
ON cities.country_id = countries.id
GROUP BY  cities.country_id
ORDER BY cities DESC;
-- 3
SELECT cities.name , cities.population , countries.id
FROM cities
JOIN countries 
ON countries.id = cities.country_id
WHERE countries.name= 'mexico' 
AND cities.population>500.000
ORDER BY cities.population DESC;

-- 4 
SELECT countries.name ,languages.language ,languages.percentage 
FROM countries 
JOIN languages
ON countries.id = languages.country_id
WHERE languages.percentage > 89
ORDER BY languages.percentage DESC;
-- 5
SELECT countries.name , countries.surface_area , countries.population 
FROM countries
WHERE countries.population>100000 
AND countries.surface_area<501 ;

-- 6
SELECT countries.name , countries.government_form  , countries.capital , countries.life_expectancy
FROM  countries 
WHERE countries.government_form='constitutional monarchy'
AND countries.capital>200 
AND countries.life_expectancy>75 ;

-- 7
SELECT countries.name , cities.name , cities.district, cities.population
FROM countries
JOIN cities 
ON  cities.country_id = countries.id
WHERE  countries.name ='Argentina'
AND cities.district= 'Buenos Aires'
AND cities.population >500000;

-- 8
SELECT countries.region , COUNT(countries.id) AS countries
 FROM countries 
 GROUP BY countries.region 
 ORDER BY countries DESC ;