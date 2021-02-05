create database if not exists ridesharing_platform;

create table if not exists drivers(
    id int not null auto_increment,
    name varchar(100) not null,
    email varchar(45) default null,
    city varchar(100) not null,
     PRIMARY KEY (id)
);

CREATE TABLE if NOT EXISTS trips (
  id int(20) NOT NULL AUTO_INCREMENT,
  fromAddress varchar(200) NOT NULL,
  toAddress varchar(200) NOT NULL,
  driverId int(20) DEFAULT NULL,
  PRIMARY KEY (id),
  KEY driver_id_fk (driverId),
  CONSTRAINT driver_id_fk FOREIGN KEY (driverId) REFERENCES drivers (id)

);