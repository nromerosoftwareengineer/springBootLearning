create table categories
(
    id   tinyint      not null
        primary key,
    name varchar(255) not null
);

create table Product
(
    id          bigint         not null
        primary key,
    name        varchar(255)   not null,
    price       decimal(10, 2) not null,
    category_id tinyint        not null,
    constraint Product_categories_id_fk
        foreign key (category_id) references categories (id)
);

