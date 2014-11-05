UPDATE emp_copy
SET deptno = 10
WHERE deptno IS NULL
/
SELECT deptno
FROM emp_copy
/
ROLLBACK
/
SELECT deptno
FROM emp_copy
/
