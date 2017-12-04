create table sessions (
  id varchar(256) primary key,
  content text,
  expire_at timestamp not null
);
