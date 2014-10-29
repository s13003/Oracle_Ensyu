SELECT empno, ename, sal, deptno
FROM employees
WHERE sal >=
(SELECT sal
FROM employees
WHERE empno = 1003)
AND empno =
(SELECT empno
FROM departments
WHERE dname = '営業')
/
