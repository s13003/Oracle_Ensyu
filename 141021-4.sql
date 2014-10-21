SELECT ename,
CASE deptno WHEN 10 THEN sal * 1.1
WHEN 20 THEN sal * 1.2
ELSE sal END "NEW_SAL"
FROM employees
/
