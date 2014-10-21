SELECT ename, sal, comm, COALESCE(sal + comm, 0, sal + comm)
FROM employees
/
