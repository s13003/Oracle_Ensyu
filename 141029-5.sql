SELECT e.empno, e.ename, m.ename 上司
FROM employees e JOIN employees m
ON(e.mgr = m.empno)
WHERE e.empno IN(
(SELECT m.mgr
FROM employees m
WHERE ename IN('山田', '伊藤')))
/
