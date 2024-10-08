CREATE TABLE EMP (
                     EMPNO INT NOT NULL,
                     ENAME VARCHAR(10),
                     JOB VARCHAR(9),
                     MGR INT,
                     HIREDATE DATE,
                     SAL DECIMAL(7, 2),
                     COMM DECIMAL(7, 2),
                     DEPTNO INT,
                     PRIMARY KEY (EMPNO)
);

INSERT INTO EMP VALUES (7839, 'KING', 'PRESIDENT', NULL, '1981-11-17', 5000, NULL, 10);
INSERT INTO EMP VALUES (7566, 'JONES', 'MANAGER', 7839, '1981-04-02', 2975, NULL, 20);
INSERT INTO EMP VALUES (7698, 'BLAKE', 'MANAGER', 7839, '1981-05-01', 2850, NULL, 30);
INSERT INTO EMP VALUES (7782, 'CLARK', 'MANAGER', 7839, '1981-06-09', 2450, NULL, 10);
INSERT INTO EMP VALUES (7788, 'SCOTT', 'ANALYST', 7566, '1987-07-13', 3000, NULL, 20);
INSERT INTO EMP VALUES (7902, 'FORD', 'ANALYST', 7566, '1981-12-03', 3000, NULL, 20);
INSERT INTO EMP VALUES (7844, 'TURNER', 'SALESMAN', 7698, '1981-09-08', 1500, 0, 30);
INSERT INTO EMP VALUES (7900, 'JAMES', 'CLERK', 7698, '1981-12-03', 950, NULL, 30);
INSERT INTO EMP VALUES (7654, 'MARTIN', 'SALESMAN', 7698, '1981-09-28', 1250, 1400, 30);
INSERT INTO EMP VALUES (7499, 'ALLEN', 'SALESMAN', 7698, '1981-02-20', 1600, 300, 30);
INSERT INTO EMP VALUES (7521, 'WARD', 'SALESMAN', 7698, '1981-02-22', 1250, 500, 30);
INSERT INTO EMP VALUES (7934, 'MILLER', 'CLERK', 7782, '1982-01-23', 1300, NULL, 10);
INSERT INTO EMP VALUES (7876, 'ADAMS', 'CLERK', 7788, '1987-07-13', 1100, NULL, 20);
INSERT INTO EMP VALUES (7658, 'CHEN', 'SALESMAN', 7698, '1981-09-08', 2500, 1500, 30);

CREATE TABLE DEPT (
                      DEPTNO INT NOT NULL,
                      DNAME VARCHAR(14),
                      LOC VARCHAR(13),
                      PRIMARY KEY (DEPTNO)
);

INSERT INTO DEPT VALUES (10, 'ACCOUNTING', 'NEW YORK');
INSERT INTO DEPT VALUES (20, 'RESEARCH', 'DALLAS');
INSERT INTO DEPT VALUES (30, 'SALES', 'CHICAGO');
INSERT INTO DEPT VALUES (40, 'OPERATIONS', 'BOSTON');

CREATE TABLE SALGRADE (
                          GRADE INT NOT NULL,
                          LOSAL DECIMAL(7, 2),
                          HISAL DECIMAL(7, 2),
                          PRIMARY KEY (GRADE)
);

INSERT INTO SALGRADE VALUES (1, 700, 1200);
INSERT INTO SALGRADE VALUES (2, 1201, 1400);
INSERT INTO SALGRADE VALUES (3, 1401, 2000);
INSERT INTO SALGRADE VALUES (4, 2001, 3000);
INSERT INTO SALGRADE VALUES (5, 3001, 9999);

CREATE TABLE BONUS (
                       ENAME VARCHAR(10),
                       JOB VARCHAR(9),
                       SAL DECIMAL(7, 2),
                       COMM DECIMAL(7, 2)
);

-- 기본적으로 BONUS 테이블은 SCOTT 스키마에 데이터가 없는 경우가 많습니다.
-- 필요에 따라 데이터를 추가할 수 있습니다. 예시 데이터를 삽입하려면 아래를 사용하세요.

INSERT INTO BONUS VALUES ('ALLEN', 'SALESMAN', 1600, 300);
INSERT INTO BONUS VALUES ('WARD', 'SALESMAN', 1250, 500);
INSERT INTO BONUS VALUES ('JONES', 'MANAGER', 2975, NULL);
