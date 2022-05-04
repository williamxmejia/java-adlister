

CREATE DATABASE IF NOT EXISTS adlister_db;

USE adlister_db;

DROP TABLE users;
DROP TABLE ads;

CREATE TABLE IF NOT EXISTS users(
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    username VARCHAR(100) NOT NULL,
    email VARCHAR(250) NOT NULL,
    password VARCHAR(250) NOT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE IF NOT EXISTS ads(
    id INT UNSIGNED NOT NULL AUTO_INCREMENT,
    user_id INT NOT NULL,
    title VARCHAR(250),
    description text,
    PRIMARY KEY (id),
    FOREIGN KEY (user_id) REFERENCES users(id)
);