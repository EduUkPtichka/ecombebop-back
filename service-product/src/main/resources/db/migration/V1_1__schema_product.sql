create schema product;

CREATE TABLE IF NOT EXISTS users
(
    id       BIGSERIAL PRIMARY KEY,
    username VARCHAR NOT NULL,
    email    VARCHAR NOT NULL,
    CONSTRAINT unique_user UNIQUE (username, email)
);

INSERT INTO users (username, email) VALUES ('test', 'user@test.com') ON CONFLICT DO NOTHING;