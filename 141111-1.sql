CREATE TABLE dept1(
  deptno NUMBER(4)
  CONSTRAINT dept1_deptno_pk PRIMARY KEY,
  dname VARCHAR2(10) NOT NULL,
  loc VARCHAR2(10))
/
INSERT INTO dept1(deptno, dname)
VALUES(10, 'hoge')
/
INSERT INTO dept1(deptno, dname)
VALUES(10, 'hoge')
/
INSERT INTO dept1(deptno)
VALUES(20)
/
DROP TABLE dept1
/
