SELECT ordno, date_ordered, cname, ename
FROM orders
JOIN employees
ON orders.salesman_no = employees.empno
JOIN customers
ON orders.custno = customers.custno
/
