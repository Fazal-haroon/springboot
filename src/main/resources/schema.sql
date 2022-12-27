create table COURSE(
    ID bigint not null,
    NAME varchar(255) not null,
    AUTHOR varchar(255) not null,
    primary key (ID)
);

INSERT INTO COURSE(ID, NAME, AUTHOR)
VALUES (1, 'Fazal', 'Java');

INSERT INTO COURSE(ID, NAME, AUTHOR)
VALUES (2, 'Haroon', 'Spring');