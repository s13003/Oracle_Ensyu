SELECT ename, sal, comm,
COALESCE(sal + comm, comm)
FROM employees
/
