SELECT empno, ename, upper(yomi)
FROM employees
WHERE UPPER(yomi) = 'TAKAHASHI'
/
