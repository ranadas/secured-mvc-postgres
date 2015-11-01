<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.5/css/bootstrap.min.css">
</head>
</body>
<div class="navbar navbar-default navbar-fixed-top">
    <div class="container">
        <div class="page-header">
            <h2> Welcome! index </h2>
        </div>
        ${message}
        <p>Click <a href="<spring:url value='/hello' />">here</a> to see a greeting.</p>
    </div>
</div>
</html>