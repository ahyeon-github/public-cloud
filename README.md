# public-cloud

## 1.RDS 이용해서 외부에서 접근 가능한 데이터베이스 생성
#### 생성한 데이터베이스에 user 정보를 저장할 수 있는 테이블을 만들고 3개의 샘플 데이터 추가

```
mysql -h <RDS엔드포인트> -u admin -p
mysql> create user 'admin'@'<RDS 엔드포인트>' identified by '<password>';
mysql> GRANT ALL PRIVILEGES ON `user_db`.* TO 'admin'@'RDS 엔드포인트';
mysql> FLUSH PRIVILEGES;
mysql> SHOW DATABASES;
mysql> USE user_db;
mysql> show tables;
mysql> INSERT INTO user (name, email, age) VALUES 
    ->     ('John Danny', 'john@gmail.com', 30),
    ->     ('Kim ahyeon', 'jane@example.com', 25),
    ->     ('Mike Rose', 'mike@example.com', 35);
Query OK, 3 rows affected (0.03 sec)
```
<img width="507" alt="스크린샷 2024-11-27 오후 3 36 03" src="https://github.com/user-attachments/assets/0a9cba00-fdd4-4dae-b61d-64bfcaa4c540">

<br>
<br>

## 2. 데이터베이스에 접속해서 테이블의 데이터를 전부 읽어서 JSON으로 리턴하는 애플리케이션

   * `http://localhost:8080/users`
      - method: GET

   ```json

   response json
   [
    {
        "id": 1,
        "name": "John Danny",
        "email": "john@gmail.com",
        "age": 30
    },
    {
        "id": 2,
        "name": "Kim ahyeon",
        "email": "jane@example.com",
        "age": 25
    },
    {
        "id": 3,
        "name": "Mike Rose",
        "email": "mike@example.com",
        "age": 35
    }
]
   ```
<img width="1441" alt="스크린샷 2024-11-27 오후 3 30 54" src="https://github.com/user-attachments/assets/e228f7f5-7be8-4827-a966-99314906bfbc">



<br>
<br>

