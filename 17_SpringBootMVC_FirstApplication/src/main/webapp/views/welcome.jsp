<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
 <html>
 <head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css"></link>
 </head>
 <body>
<div class="container text-danger center">
   <c:choose>
        <c:when test="${Message ne null}">
            ${Message}
        </c:when>
        <c:otherwise>
            ${wishMessage}
        </c:otherwise>
   </c:choose>
</div>
</body>
</html>