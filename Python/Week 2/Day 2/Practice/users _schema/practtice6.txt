SELECT * FROM users.users;
INSERT INTO users (first_name, last_name, email) VALUES ('yassin', 'daira','yassin.daira@gmail.com'),('amine','smith','amine.smith@gmail.com'),('bilel','Droger','bilel.Droger@gmail.com');
SELECT * FROM users WHERE users.email=('yassin.daira@gmail.com');
SELECT *FROM users WHERE id=(3);
UPDATE users SET last_name='pancakes' WHERE id=(3) ;
DELETE FROM users WHERE id=(2);
SELECT *FROM users ORDER BY first_name ASC;


