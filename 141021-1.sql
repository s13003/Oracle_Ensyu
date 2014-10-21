SELECT ename, sal, comm,
COALESCE(sal + comm, comm, sal)
FROM employees
/
