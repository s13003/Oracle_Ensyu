SELECT e.empno, e.ename, m.empno, m.ename
FROM employees e LEFT OUTER JOIN employees m
ON e.mgr = m.empno
/
