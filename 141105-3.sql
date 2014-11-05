UPDATE emp_copy
SET deptno = null
WHERE empno IN(1013, 1014)
/
SELECT *
FROM emp_copy
/
ROLLBACK
/
SELECT *
FROM emp_copy
/
