CREATE TABLE t_orders (
    id BIGINT NOT NULL AUTO_INCREMENT,     -- The 'id' field is a BIGINT and auto-increments
    order_number VARCHAR(255) NOT NULL,    -- The 'order_number' field is a VARCHAR with a maximum length of 255 characters
    sku_code VARCHAR(255) NOT NULL,        -- The 'sku_code' field is a VARCHAR with a maximum length of 255 characters
    price DECIMAL(10, 2) NOT NULL,         -- The 'price' field is a DECIMAL with 10 digits total and 2 digits after the decimal point
    quantity INT NOT NULL,                 -- The 'quantity' field is an INT
    PRIMARY KEY (id)                       -- 'id' is the primary key
);