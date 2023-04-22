CREATE TABLE person (
    id int(11) NOT NULL AUTO_INCREMENT,
    code varchar(100) NOT NULL,
    name varchar(100) NOT NULL,
    belong_nm varchar(500) NOT NULL,
    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;