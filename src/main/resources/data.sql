INSERT INTO PRODUCT (id, name, type, desc, brand) 
values ('MOBO1', 'Samsung A6 plus', 'Mobile', 'Samsung descr', 'Samsung');
INSERT INTO PRODUCT (id, name, type, desc, brand) 
values ('MOBO2', 'iPhone X plus', 'Mobile', 'Apple descr', 'Apple');
INSERT INTO PRODUCT (id, name, type, desc, brand) 
values ('TLV01', 'Sony Bravia KLV-50W...', 'Television', 'Sony descr', 'Sony');
INSERT INTO PRODUCT (id, name, type, desc, brand) 
values ('CAM01', 'Canon EOS 1500D', 'DSLR Camera', 'Canon descr', 'Canon');
INSERT INTO PRODUCT (id, name, type, desc, brand) 
values ('SPK01', 'JBL Cinema 510 5.1', 'Home Theater Speaker', 'JBL descr', 'JBL');

INSERT INTO CUSTOM_USER (id, username, password, role)
values (101, 'denis', '$2a$10$JJbZakUYsm9FYTzJoAyRVuDu4bWHvDP/faWNvPTSguaSGBJY2OlAa', 'ADMIN');
INSERT INTO CUSTOM_USER (id, username, password, role)
values (102, 'aleks', '$2a$10$JJbZakUYsm9FYTzJoAyRVuDu4bWHvDP/faWNvPTSguaSGBJY2OlAa', 'USER');
INSERT INTO CUSTOM_USER (id, username, password, role)
values (103, 'mark', '$2a$10$JJbZakUYsm9FYTzJoAyRVuDu4bWHvDP/faWNvPTSguaSGBJY2OlAa', 'USER');