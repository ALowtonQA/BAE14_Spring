DROP TABLE IF EXISTS user CASCADE;

CREATE TABLE user (
    id INT AUTO_INCREMENT,
    firstname VARCHAR(255) NOT NULL,
    last_name VARCHAR(255) NOT NULL,
    username VARCHAR(255) UNIQUE NOT NULL,
    PRIMARY KEY (id)
);