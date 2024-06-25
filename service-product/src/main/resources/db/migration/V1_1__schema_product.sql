-- create schema product;

CREATE TABLE IF NOT EXISTS users
(
    id       BIGSERIAL PRIMARY KEY,
    username VARCHAR NOT NULL,
    email    VARCHAR NOT NULL,
    CONSTRAINT unique_user UNIQUE (username, email)
);

create table if not exists product_item(
    id serial PRIMARY KEY,
    main_image VARCHAR NOT NULL,
    title VARCHAR NOT NULL
);

INSERT INTO users (username, email) VALUES ('test', 'user@test.com') ON CONFLICT DO NOTHING;