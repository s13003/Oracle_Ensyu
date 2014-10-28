SELECT empno, ename, deptno, dname
FROM departments RIGHT OUTER JOIN employees
USING(deptno)
/
