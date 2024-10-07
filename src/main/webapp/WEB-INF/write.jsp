<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>할일 작성하기</title>
<link rel="stylesheet" type="text/css" href="/css/write.css" />

</head>
<body>
<form method="post">
  <div class="content-box">
      <h1>일정 작성하기</h1>
      <div class="detail-box">
        <label for="subject" class="title">내용</label>
        <input id="subject" name="subject" type="text" placeholder="내용 입력" class="titleinput" />
      </div>
      <div class="deadline-box">
        <label for="deadLine" class="deadline">기한</label>
        <input id="deadLine" name="deadLine" type="date" placeholder="기한 날짜 입력" class="deadlineinput" />
      </div>
      <div class="right-align">
        <input type="submit" value="저장">
      </div>
  </div>
</form>
</body>
</html>