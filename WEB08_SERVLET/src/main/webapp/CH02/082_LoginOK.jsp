<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>082_LoginOK.jsp</title>
</head>
<body>

<h1>
<%= request.getAttribute("name")%>(<%=request.getParameter("id")%>)님 로그인하셨습니다
</h1>
<h1>환영합니다</h1>
</body>
</html>