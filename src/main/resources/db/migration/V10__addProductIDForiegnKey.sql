ALTER TABLE wishlist
    ADD CONSTRAINT fk_wishlist_on_product FOREIGN KEY (product_id) REFERENCES product (id);

ALTER TABLE wishlist
    ADD CONSTRAINT fk_wishlist_on_user FOREIGN KEY (user_id) REFERENCES users (id);