SELECT deptno, COUNT(deptno), AVG(sal)
FROM employees
GROUP BY deptno
/
