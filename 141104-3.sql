INSERT INTO employees(empno, ename, hiredate)
VALUES(&&empno, '&ename', '&hiredate')
/
SELECT &empno
FROM employees
/
DELETE
FROM employees
WHERE empno = &empno
/
SELECT *
FROM employees
/
