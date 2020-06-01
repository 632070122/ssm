<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <jsp:forward page="/pages/main.jsp"/>
    <a href="product/findAll.do">查询所有的产品信息</a>
    <a href="${pageContext.request.contextPath}/product/findAll.do">查询所有的产品信息</a>


</body>
</html>
