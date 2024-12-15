--liquibase formatted sql
--changeset DeerDancer5:8

INSERT INTO CATEGORIES (id, name,description) VALUES (3,'School','Assignments, Study sessions etc.');
INSERT INTO CATEGORIES (id, name,description) VALUES (4,'Financial','');
INSERT INTO CATEGORIES (id, name,description) VALUES (5,'Health','');

UPDATE TASKS SET start_date = '2024-12-20 14:00:00' WHERE id = 1;


INSERT INTO TASKS (id, summary, description, start_date, end_date, category,owner,status) VALUES
    (4,'Django Assigment','Create to do app','2024-12-21','2024-12-21',3,1,3);

INSERT INTO TASKS (id, summary, description, start_date, end_date, category,owner,status) VALUES
    (5,'Full Body Workout','','2024-12-22','2024-12-22',2,1,3);

INSERT INTO TASKS (id, summary, description, start_date, end_date, category,owner,status) VALUES
    (6,'Coffee with Mary','Catching up','2024-12-23','2024-12-23',1,1,2);
