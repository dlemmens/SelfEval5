create table incidents(
incident_id INT(10) PRIMARY KEY AUTO_INCREMENT,
name varchar(50),
distance int(255),
type varchar(200),
highway_id int(10)
);

alter table incidents add foreign key
(highway_id) references
highways(highway_id);