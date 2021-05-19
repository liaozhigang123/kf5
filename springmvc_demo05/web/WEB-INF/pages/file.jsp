<%--
  Created by IntelliJ IDEA.
  User: 27468
  Date: 2021/4/22
  Time: 15:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <table align="center" width="500" border="1" cellpadding="5" cellspacing="0"
           style="text-align: center;border: 1px solid rebeccapurple">
        <tr>
            <td>文件名</td>
            <td>上传时间</td>
            <td>操作</td>
        </tr>
        <c:forEach items="${fileUploadList}" var="f">
            <tr>
                <td>${f.foldname}</td>
                <td>${f.ttime}</td>
                <td>
                    <a href="download?fnewname=${f.fnewname}&foldname=${f.foldname}">下载</a>
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>
