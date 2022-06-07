 CREATE DATABASE Organisational_News_PortalAPI;
 \c Organisational_News_PortalAPI

 CREATE TABLE IF NOT EXISTS departments (
    id serial PRIMARY KEY,
    name varchar,
    description varchar,
    size varchar
 );

 CREATE TABLE IF NOT EXISTS users(
 id serial PRIMARY KEY,
 name varchar,
 position varchar,
 role varchar,
 department_id int
 );

 CREATE TABLE IF NOT EXISTS news(
 id serial PRIMARY KEY,
 title varchar,
 content varchar,
 department_id int
 );

 CREATE DATABASE Organisational_News_PortalAPI_test WITH TEMPLATE Organisational_News_PortalAPI;