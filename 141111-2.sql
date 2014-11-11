CREATE TABLE emp1(
  empno NUMBER(4)
  CONSTRAINT emp1_empno_pk PRIMARY KEY,
  ename VARCHAR(10)
  CONSTRAINT emp1_ename_nn NOT NULL,
  deptno NUMBER(4),
  CONSTRAINT emp1_departments_deptno_fk FOREIGN KEY(deptno)
  REFERENCES departments(deptno))
/
INSERT INTO emp1(empno, ename)
VALUES(10, 'hoge')
/
INSERT INTO emp1(empno, ename)
VALUES(10, 'hoge')
/
INSERT INTO emp1(empno)
VALUES(5)
/
INSERT INTO emp1(empno, ename, deptno)
VALUES(50, 'fuga', 9999)
/
DROP TABLE emp1
/
