CREATE VIEW v_emp
AS SELECT empno, ename, sal, deptno
FROM emp2
/
DELETE
FROM v_emp
WHERE empno = 1014
/
UPDATE v_emp
SET sal = 300000
WHERE empno = 1013
/
INSERT INTO v_emp(empno, ename, sal, deptno)
VALUES(1030, '山口', 200000, null)
/
SELECT *
FROM v_emp
/
