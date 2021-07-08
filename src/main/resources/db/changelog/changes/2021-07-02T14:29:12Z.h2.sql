--liquibase formatted sql

--changeset leonardo:1625236157248-1
CREATE TABLE Contact (id BIGINT AUTO_INCREMENT NOT NULL, email VARCHAR(255), phone_number VARCHAR(255), CONSTRAINT ContactPK PRIMARY KEY (id));

