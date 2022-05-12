USE adlister_db;

DROP TABLE IF EXISTS ads;
DROP TABLE IF EXISTS users;

CREATE TABLE users (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    username VARCHAR(240) NOT NULL,
    email VARCHAR(240) NOT NULL,
    password VARCHAR(255) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE ads (
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    user_id INT UNSIGNED NOT NULL,
    title VARCHAR(240) NOT NULL,
    description TEXT NOT NULL,
    price_in_cents DOUBLE,
    PRIMARY KEY (id),
    FOREIGN KEY (user_id) REFERENCES users(id)
        ON DELETE CASCADE
);

INSERT INTO users(username, email, password)
VALUES('william123', 'email@email.com', 'password'),
('william1234', 'email@email.com', 'password'),
('william1235', 'email@email.com', 'password'),
('william123456', 'email@email.com', 'password'),
('william1234567', 'email@email.com', 'password'),
('william12345678', 'email@email.com', 'password'),
('william3', 'email@email.com', 'password'),
('william1231234', 'email@email.com', 'password');


INSERT INTO ads(user_id, title, description, price_in_cents)
VALUES (1, 'Pizza', 'Best pizza in the world', 10),
       (2, 'Iphone11', 'Iphone for sale', 150),
       (3, 'Macbook Pro 11', 'Macbook pro for sale, cheap price', 150),
       (4, 'Macbook Pro 11', 'Macbook pro for sale, cheap price', 150),
       (5, 'Macbook Pro 11', 'Macbook pro for sale, cheap price', 550),
       (6, 'Macbook Pro 11', 'Macbook pro for sale, cheap price', 150)