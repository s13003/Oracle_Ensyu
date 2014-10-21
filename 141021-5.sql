SELECT ename,
DECODE(deptno, 10, sal * 1.1,
20, sal * 1.2,
sal)
NEW_SAL
FROM employees
/
