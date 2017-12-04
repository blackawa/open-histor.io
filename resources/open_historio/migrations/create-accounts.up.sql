create table accounts (
  id serial primary key,
  name varchar(256) not null,
  email varchar(256) not null,
  password varchar(256) not null,
  unique(name, email)
);
