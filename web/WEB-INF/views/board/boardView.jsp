<%--
  Created by IntelliJ IDEA.
  User: dean
  Date: 2019-07-15
  Time: 22:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<head>
    <title>Title</title>
</head>
<body>

    <table>
        <thead>
            <tr>
                <th>번호</th>
                <th>제목</th>
                <th>작성내용</th>
                <th>작성자</th>
                <th>작성일</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="boardList" items="${boardList}">
                <tr>
                    <td>${boardList.boardNo}</td>
                    <td>${boardList.boardTitle}</td>
                    <td>${boardList.boardContents}</td>
                    <td>${boardList.boardWriter}</td>
                    <td>${boardList.boardWDate}</td>
                </tr>
            </c:forEach>
        </tbody>

    </table>
</body>
</html>
