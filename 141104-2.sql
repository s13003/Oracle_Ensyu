INSERT INTO departments(deptno, dname, loc)
VALUES(60, '経理', null)
/
SELECT *
FROM departments
/
DELETE
FROM departments
WHERE deptno = 60
/
SELECT *
FROM departments
/
