<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="style.css" type="text/css" rel="stylesheet">
<title>Date</title>
</head>
<body>
<h1>Date</h1>
<h2><c:out value="${day}"/></h2>
<c:out value="${date}"/>
<script>
alert("This is the Date template!");
</script>
</body>
</html>