<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.5/css/bootstrap.min.css">
    <title>Hello World!</title>
</head>
</body>


<div class="container">
    <div class="row">
        <div class="span12">
            <h1>Hello <b><c:out value="${pageContext.request.remoteUser}"/></b></h1>

            <form action="/logout" method="post">
                <input type="submit" value="Sign Out"/>
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            </form>
        </div>
    </div>
</div>

</html>