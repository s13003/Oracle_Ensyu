INSERT INTO dept_copy
SELECT deptno+1, dname, loc
FROM departments
/
SELECT *
FROM dept_copy
/
ROLLBACK
/
SELECT *
FROM dept_copy
/
