CREATE TABLE wishlist
(
    product_id BIGINT NOT NULL,
    user_id    BIGINT NOT NULL,
    CONSTRAINT pk_wishlist PRIMARY KEY (product_id, user_id)
);