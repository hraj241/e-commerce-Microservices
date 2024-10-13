-- V1__init.sql: Create t_inventory table

CREATE TABLE t_inventory (
    id BIGINT AUTO_INCREMENT,      -- ID field as BIGINT with auto-increment
    sku_code VARCHAR(255) NOT NULL, -- SKU code as VARCHAR with a max length of 255
    quantity INT NOT NULL,         -- Quantity as an integer
    PRIMARY KEY (id)               -- Set ID as the primary key
);