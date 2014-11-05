UPDATE emp_copy
SET deptno = 20,
ename = '林'
WHERE deptno = 1012
/
SELECT *
FROM emp_copy
/
ROLLBACK
/
select *
FROM emp_copy
/
