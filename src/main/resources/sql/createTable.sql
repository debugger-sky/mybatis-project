create table TB_SRV01 (
    ID SERIAL PRIMARY KEY,
    TITLE varchar(50) NOT NULL ,
    CONTENT varchar(2000),
    USER_ID varchar(10) NOT NULL ,
    CREATE_DATE date,
    UPDATE_DATE date
);

create table TB_USER (
    ID SERIAL PRIMARY KEY,
    USER_ID varchar(10) NOT NULL UNIQUE ,
    USER_NM varchar(20) NOT NULL ,
    USER_PW varchar(30) NOT NULL ,
    CREATE_DATE date,
    UPDATE_DATE date
);