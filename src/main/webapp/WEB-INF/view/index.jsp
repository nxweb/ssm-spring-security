<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>test</title>
</head>
<body>
<c:forEach items="${listData}" var="stu">
    ${stu.id}
    ${stu.name}
    ${stu.birthDate}
    ${stu.remark}
</c:forEach>
</body>
</html>
