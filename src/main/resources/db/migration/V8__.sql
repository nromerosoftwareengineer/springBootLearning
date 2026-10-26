ALTER TABLE product
    MODIFY category_id TINYINT NULL;

ALTER TABLE categories
    MODIFY name VARCHAR (255) NULL;

ALTER TABLE product
    MODIFY name VARCHAR (255) NULL;

ALTER TABLE product
    MODIFY price DECIMAL (10, 2) NULL;

ALTER TABLE addresses
    MODIFY state VARCHAR (255) NULL;

ALTER TABLE addresses
    MODIFY user_id BIGINT NULL;