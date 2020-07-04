# 虚拟考试系统的分层架构实现

### 运行

```bash
./gradlew run
```

### 现有操作

#### paper
访问 http://localhost:8080/papers

| 功能          | Method | URI               |
| ------------- | ------ | ----------------- |
| 获取所有paper | GET    | /papers           |
| 组卷          | POST   | /papers           |
| 重新组卷      | PUT    | /papers/:paper_id |

#### quiz bank
访问 http://localhost:8080/quizbank

| 功能          | Method | URI               |
| ------------- | ------ | ----------------- |
| 获取quiz bank | GET    | /quizbank           |
| 题库中增加题          | POST   | /quizbank           |
| 修改题库中的题          | PUT   | /quizbank/:blank_quiz_id           |
| 删除题库中的题          | DELETE   | /quizbank/:blank_quiz_id           |
