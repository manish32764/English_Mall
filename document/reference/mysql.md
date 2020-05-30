# Mysql Common Commands

## Data Definition Statement (DDL)

### Database Operations

- Login database: mysql -uroot -proot
- Create database test
- View all databases: show databases
- Use database: use test
- View all data sheets: show tables
- Delete database: drop database test

### Table Operations

- Create table emp (ename varchar (10), hiredate date date, sal decimal ( 10,2), deptno int (2))
         create table dept(deptno int(2),deptname varchar(10))
- View table definition: desc emp
- View table definition (detail): show create table emp\ G
- Delete table: drop table emp
- Modify table fields: alter table emp modify ename varchar (20)
- Add table field: alter table emp add column age int (3)
- Delete table field: alter table emp drop column age
- field renamed; alter table emp change age age1 int (4)
- Change table name: alter table emp rename emp1

## Data manipulation statements (DML)

### Insert Record

- Specify name to insert: insert into emp (ename, hiredate, sal, deptno) values (' zhangsan', '2018-01-01', '2000',1)
- Insert without specifying name: insert into emp values ('lisi', '2018-01-01', '2000',1)
- Bulk insert data: insert into dept values (1, 'dept1'), (2, 'dept2')

### Modifying Records

update emp set sal='4000',deptno=2 where ename='zhangsan'

### Delete Record

delete from emp where ename='zhangsan'

### Querking Records

- Querate all records: select* from emp
- Querying non-duplicate records: select distinct deptno from emp
- Condition query: select* from emp where deptno=1 and sal<3000
- Sort and limit: select* from emp order by deptno desc limit 2
- Aggregate (query department numbers greater than 1): select deptno, count (1) from emp group by deptno have count (1) > 1
- Join query: select* from emp e left join dept d on e.deptno=d.deptno
- Subquery: select* from emp where deptno in (select deptno from dept)
- Record joint: select deptno from emp union select deptno from dept

## Data Control Statement (DCL)

- Grant permission: grant select, insert on test.* to 'test' @'localhost' cickedby '123'
- Retrieval permission: revoke insert on test.* from 'test' @'localhost'

## Other

### character set related
- View character set: show variables like 'character%'
- Specify character set when creating database: create database mall character set utf8

### Modifying Time Zone
- Change mysql global time zone to Beijing time, i.e. the East 8 zone we are in: set global time_zone = '+8:00 ';
- Modify the current session time zone: set time_zone = '+ 8:00 '
- Effective immediately: flush privileges

### Permissions Related
- Grant all permissions to all databases: grant all privileges on *.* to z1 @localhost cickedby '123'
- Grant all permissions (including grant) to all databases: grant all privileges on *.* to z1 @localhost with grant option
- Grant SUPER PROCESS FILE permission: grant super, process, file on *.* to z3 @localhost
- Grant login only: grant usage on *.* to z4 @localhost
- View account access: show granted for z1 @localhost
- Change your password: set password = password ('123')
- Admin change password: set password for 'z1' @'localhost' = password ('123')
- Delete account number: drop user z2 @localhost
