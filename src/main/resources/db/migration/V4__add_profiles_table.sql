create table profiles
(
    id             bigint auto_increment
        primary key,
    bio            TEXT          null,
    phone_number   varchar(15)   null,
    date_of_birth  DATE          null,
    loyalty_points int default 0 null,
    user_id        bigint        not null,
    constraint profiles_users_id_fk
        foreign key (user_id) references users (id)
);

