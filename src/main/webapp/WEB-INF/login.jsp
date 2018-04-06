<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="login.do">
<fieldset>
<legend>登录</legend>
<input name="uname"><br>
<input type="password" name="pwd"><br>
${fail_login}<br>
<input type="submit" value="确定">
</fieldset>
</form>
</body>
</html>