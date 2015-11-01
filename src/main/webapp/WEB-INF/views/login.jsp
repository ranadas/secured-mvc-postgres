<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.5/css/bootstrap.min.css">
    <title> Login </title>
</head>
</body>


<div class="container">
    <div class="row">
        <div class="span12">
            <c:if test="${param.error ne null}">
                <div>
                    Invalid username and password.
                </div>
            </c:if>
            <c:if test="${param.logout ne null}">
                <div>
                    You have been logged out.
                </div>
            </c:if>

            <form class="form-horizontal" action="/login" method="POST">
                <fieldset>
                    <div id="legend">
                        <legend class="">Login</legend>
                    </div>
                    <div class="control-group">
                        <!-- Username -->
                        <label class="control-label"  for="username">Username</label>
                        <div class="controls">
                            <input type="text" id="username" name="username" placeholder="" class="input-xlarge">
                        </div>
                    </div>
                    <div class="control-group">
                        <!-- Password-->
                        <label class="control-label" for="password">Password</label>
                        <div class="controls">
                            <input type="password" id="password" name="password" placeholder="" class="input-xlarge">
                        </div>
                    </div>
                    <div class="control-group">
                        <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
                        <div><input class="btn btn-success" type="submit" value="Sign In"/></div>
                    </div>
                </fieldset>
            </form>
        </div>
    </div>
</div>

</html>