# java-practice
## Cotent
### 기본문법 활용하기
1. 변수
2. 연산자
3. 기본입출력
4. 조건문
5. 반복문
6. 기본문법 활용
7. 형변환 (Casting)
8. 배열
9. 값복사와 참조복사
10. 메서드
11. 재귀호출

### 언어특성 활용하기
12. 클래스와 객체
13. 은닉성
14. 상속성
15. 추상화
16. 인터페이스
17. 다른 형태의 클래스
18. 패키지와 라이브러리

### 라이브러리 활용하기
19. Wrapper Class
20. String 클래스를 활용한 문자열 처리
21. Regex 클래스를 활용한 정규표현힉 검사
22. Exception (예외처리)
23. Calendar 클래스를 활용한 날짜 처리
24. 컬렉션 프레임워크
25. 파일 입출력
26. JSON 데이터 다루기

### JDBC
27. 데이터베이스 접속하기
28. PreparedStatement 객체 사용
29. MyBatis
30. Java Service 패턴



### DB Table
```sql
>>> desc department;

+--------+--------------+------+-----+---------+----------------+
| Field  | Type         | Null | Key | Default | Extra          |
+--------+--------------+------+-----+---------+----------------+
| deptno | int          | NO   | PRI | NULL    | auto_increment |
| dname  | varchar(100) | NO   |     | NULL    |                |
| loc    | varchar(100) | YES  |     | NULL    |                |
+--------+--------------+------+-----+---------+----------------+
3 rows in set (0.09 sec)
```

```sql
>>> desc student;
+-----------+-------------+------+-----+---------+----------------+
| Field     | Type        | Null | Key | Default | Extra          |
+-----------+-------------+------+-----+---------+----------------+
| studno    | int         | NO   | PRI | NULL    | auto_increment |
| name      | varchar(50) | NO   |     | NULL    |                |
| userid    | varchar(50) | NO   |     | NULL    |                |
| grade     | int         | NO   |     | NULL    |                |
| idnum     | char(13)    | NO   |     | NULL    |                |
| birthdate | datetime    | NO   |     | NULL    |                |
| tel       | varchar(13) | NO   |     | NULL    |                |
| height    | int         | NO   |     | NULL    |                |
| weight    | int         | NO   |     | NULL    |                |
| deptno    | int         | NO   | MUL | NULL    |                |
| profno    | int         | YES  | MUL | NULL    |                |
+-----------+-------------+------+-----+---------+----------------+
11 rows in set (0.04 sec)
```

```sql
>>> desc professor
+----------+-------------+------+-----+---------+----------------+
| Field    | Type        | Null | Key | Default | Extra          |
+----------+-------------+------+-----+---------+----------------+
| profno   | int         | NO   | PRI | NULL    | auto_increment |
| name     | varchar(50) | NO   |     | NULL    |                |
| userid   | varchar(50) | NO   |     | NULL    |                |
| position | varchar(20) | NO   |     | NULL    |                |
| sal      | int         | NO   |     | NULL    |                |
| hiredate | datetime    | NO   |     | NULL    |                |
| comm     | int         | YES  |     | NULL    |                |
| deptno   | int         | NO   | MUL | NULL    |                |
+----------+-------------+------+-----+---------+----------------+
8 rows in set (0.00 sec)
```