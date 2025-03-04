--liquibase formatted sql
--changeset DeerDancer5:10

ALTER TABLE TASKS ALTER COLUMN start_date TYPE timestamp USING start_date::timestamp;
ALTER TABLE TASKS ALTER COLUMN end_date TYPE timestamp USING end_date::timestamp;

UPDATE TASKS SET start_date = '2024-12-20 14:00:00' WHERE id = 1;
UPDATE TASKS SET end_date = '2024-12-20 16:00:00' WHERE id = 1;

UPDATE TASKS SET start_date = '2024-12-22 16:00:00' WHERE id = 2;
UPDATE TASKS SET end_date = '2024-12-22 18:00:00' WHERE id = 2;

UPDATE TASKS SET start_date = '2024-12-30 12:00:00' WHERE id = 3;
UPDATE TASKS SET end_date = '2024-12-30 13:30:00' WHERE id = 3;

UPDATE TASKS SET start_date = '2024-12-21 14:00:00' WHERE id = 4;
UPDATE TASKS SET end_date = '2024-12-21 18:30:00' WHERE id = 4;

UPDATE TASKS SET start_date = '2024-12-22 13:00:00' WHERE id = 5;
UPDATE TASKS SET end_date = '2024-12-22 15:00:00' WHERE id = 5;

UPDATE TASKS SET start_date = '2024-12-23 12:00:00' WHERE id = 6;
UPDATE TASKS SET end_date = '2024-12-23 13:00:00' WHERE id = 6;