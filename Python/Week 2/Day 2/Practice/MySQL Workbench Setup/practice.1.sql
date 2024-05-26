SELECT * FROM dojos; 

SELECT * FROM ninjas;

INSERT INTO  dojos (name) 
VALUES('ekko'), ('zed'),('jax');

DELETE FROM dojos WHERE id=(1);

DELETE FROM dojos WHERE id=(2);

DELETE FROM dojos WHERE id=(3);

INSERT INTO ninjas (first_name,last_name,age,dojo_id) VALUE ('itachi','uchicha',24,13),('naruto','uzumaki',19,13),('sai','daira',21,13);

INSERT INTO ninjas (first_name,last_name,age,dojo_id) VALUE ('dhia','chihi',21,14),('amine','mimou',21,14),('dali','chkouha',21,14);

INSERT INTO ninjas (first_name,last_name,age,dojo_id) VALUE ('lassad','daira',21,15),('messi','cherni',36,15),('Ronaldo','kefi',39,15);

SELECT * FROM  ninjas WHERE dojo_id=13;

SELECT * FROM ninjas WHERE  dojo_id=15;

SELECT dojos.name FROM dojos 
JOIN ninjas ON ninjas.dojo_id=dojos.id
WHERE ninjas.id=9;

SELECT * FROM dojos
LEFT JOIN ninjas ON dojos.id = ninjas.dojo_id ;