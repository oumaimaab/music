<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Elattar Saad
  Date: 12/27/19
  Time: 22:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Registration</title>
    <!-- UIkit CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/uikit@3.2.6/dist/css/uikit.min.css"/>
    <!-- UIkit JS -->
    <script src="https://cdn.jsdelivr.net/npm/uikit@3.2.6/dist/js/uikit.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/uikit@3.2.6/dist/js/uikit-icons.min.js"></script>
</head>
<body>
<div class="uk-container uk-position-center" style="padding: 20%">
    <form action="/registration" method="post">
        <div class="uk-width-1-1" uk-grid>
            <c:if test="${isPasswordNotMatching}">
                <div class="uk-width-1-1@s">
                    <div class="uk-alert-danger" uk-alert>
                        <p>Password and password confirmation are not matching !</p>
                    </div>
                </div>
            </c:if>
            <div class="uk-width-1-1@s">
                <div class="uk-inline uk-width-1-1">
                    <span class="uk-form-icon uk-text-primary" uk-icon="icon: pencil"></span>
                    <input class="uk-input" type="text" name="fullName" placeholder="Your full name ..." required>
                </div>
            </div>
            <div class="uk-width-1-1@s">
                <div class="uk-inline uk-width-1-1">
                    <span class="uk-form-icon uk-text-primary" uk-icon="icon: mail"></span>
                    <input class="uk-input" type="email" name="email" placeholder="Your E-mail address ..." required>
                </div>
            </div>
            <div class="uk-width-1-1@s">
                <div class="uk-inline uk-width-1-1">
                    <span class="uk-form-icon uk-text-primary" uk-icon="icon: user"></span>
                    <input class="uk-input" type="text" name="username" placeholder="Choose a username ..." required>
                </div>
            </div>

            <div class="uk-width-1-2@s">
                <div class="uk-inline uk-width-1-1">
                    <span class="uk-form-icon uk-text-primary" uk-icon="icon: lock"></span>
                    <input class="uk-input" type="password" name="password" minlength="6"
                           placeholder="Choose a password ..." required>
                </div>
            </div>
            <div class="uk-width-1-2@s">
                <div class="uk-inline uk-width-1-1">
                    <span class="uk-form-icon uk-text-primary" uk-icon="icon: lock"></span>
                    <input class="uk-input" type="password" name="passwordConfirmation" minlength="6"
                           placeholder="Confirm that password ..." required>
                </div>
            </div>
            <div class="uk-margin uk-width-1-1">
                <button type="submit" class="uk-button uk-button-primary uk-width-1-1 uk-margin"> Join the club !
                </button>
            </div>
            <div class="uk-margin uk-width-1-1">
                Do you have an account?<a class="uk-link-text uk-text-primary" href="/register"> Sign in instead !</a>
            </div>
        </div>
    </form>
</div>
</body>
</html>
