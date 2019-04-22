<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>错误</title>
</head>
<body>
        <h3>发生时间：${errorInfo.time}</h3>
        <h3>访问地址：${errorInfo.url}</h3>
        <h3>问题类型：${errorInfo.error}</h3>
        <h3>通信状态：${errorInfo.statusCode},${errorInfo.reasonPhrase}</h3>
        <h3>堆栈信息：${errorInfo.stackTrace}</h3>
</body>
</html>
