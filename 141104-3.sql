INSERT INTO employees(empno, ename, hiredate)
VALUES(&&empno, '&ename', '&hiredate')
/
SELECT *
FROM employees
/
DELETE
FROM employees
WHERE empno = &empno
/
SELECT *
FROM employees
/
