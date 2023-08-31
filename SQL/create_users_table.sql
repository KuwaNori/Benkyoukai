CREATE TABLE users(
    user_id varchar(16) UNIQUE PRIMARY KEY,
    name varchar(20) NOT NULL,
    birth_day date,
    bio varchar(100),
    following int NOT NULL,
    follower int NOT NULL,
    icon_dir varchar(400),
    private boolean NOT NULL
);