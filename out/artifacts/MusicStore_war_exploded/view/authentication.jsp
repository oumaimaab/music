<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <!-- UIkit CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/uikit@3.2.6/dist/css/uikit.min.css"/>
    <!-- UIkit JS -->
    <script src="https://cdn.jsdelivr.net/npm/uikit@3.2.6/dist/js/uikit.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/uikit@3.2.6/dist/js/uikit-icons.min.js"></script>
</head>
<body>
<div class="uk-container uk-position-center">
    <form action="/authentication" method="post">
        <c:if test="${isActivated}">
            <div class="uk-margin uk-width-1-1">
                <div class="uk-alert-danger" uk-alert>
                    <p>Wrong username or password !</p>
                </div>
            </div>
        </c:if>
        <c:if test="${isRegistrationSucceeded}">
            <div class="uk-margin uk-width-1-1">
                <div class="uk-alert-success" uk-alert>
                    <p>Registration succeed! try to sign in now.</p>
                </div>
            </div>
        </c:if>
        <div class="uk-margin uk-width-1-1">
            <div class="uk-inline uk-width-1-1">
                <span class="uk-form-icon uk-text-primary" uk-icon="icon: user"></span>
                <input class="uk-input" type="text" name="username" required>
            </div>
        </div>
        <div class="uk-margin uk-width-1-1">
            <div class="uk-inline uk-width-1-1">
                <span class="uk-form-icon uk-text-primary" uk-icon="icon: lock"></span>
                <input class="uk-input" type="password" name="password" minlength="6" required>
            </div>
        </div>
        <div class="uk-width-1-1">
            <button type="submit" class="uk-button uk-button-primary uk-width-1-1 "> Sign in!</button>
        </div>
        <div class="uk-margin uk-width-1-1">
            Don't you have an account?<a class="uk-link-text uk-text-primary" href="/registration"> Try for free!</a>
        </div>
    </form>
</div>
</body>
</html>