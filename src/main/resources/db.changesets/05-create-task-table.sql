--liquibase formatted sql
--changeset DeerDancer5:4
CREATE TABLE TASKS(
    id serial PRIMARY KEY,
    summary VARCHAR(40) NOT NULL,
    description VARCHAR(100),
    start_date DATE,
    end_date DATE,
    category serial,
    owner serial
);

INSERT INTO TASKS (id, summary, description, start_date, end_date, category,owner) VALUES
                (1,'Chest workout','Do not skip','2024-12-20','2024-12-20',2,1);

INSERT INTO TASKS (id, summary, description, start_date, end_date, category,owner) VALUES
    (2,'Stamina workout','','2024-12-22','2024-12-22',2,2);


INSERT INTO TASKS (id, summary, description, start_date, end_date, category,owner) VALUES
    (3,'Meeting with HR','','2024-12-10','2024-12-10',1,4);
