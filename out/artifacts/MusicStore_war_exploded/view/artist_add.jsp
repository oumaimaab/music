<%--
  Created by IntelliJ IDEA.
  User: Elattar Saad
  Date: 12/31/19
  Time: 17:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Music Store - Add an artist</title>
    <!-- UIkit CSS -->
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/uikit@3.2.6/dist/css/uikit.min.css"/>
    <!-- UIkit JS -->
    <script src="https://cdn.jsdelivr.net/npm/uikit@3.2.6/dist/js/uikit.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/uikit@3.2.6/dist/js/uikit-icons.min.js"></script>
</head>
<body>
<nav class="uk-navbar-container" uk-navbar>
    <div class="uk-navbar-left">
        <ul class="uk-navbar-nav">
            <li><a href="#">NEWS</a></li>
            <li class=""><a href="/artists">ARTISTS</a></li>
            <li><a href="/songs">NEW SONGS</a></li>
            <li><a href="/add-song">ADD A SONG</a></li>
            <li class="uk-active"><a href="/add-artist">ADD AN ARTIST</a></li>
        </ul>

    </div>
    <div class="uk-navbar-right uk-margin-right">
        <ul class="uk-navbar-nav">
            <li>
                <a href="#">
                    <c:if test="${ !empty sessionScope}">
                        <p>${ sessionScope.get("connectedUser").getFullName() }</p>
                    </c:if>
                </a>
                <div class="uk-navbar-dropdown">
                    <ul class="uk-nav uk-navbar-dropdown-nav">
                        <li class="uk-active"><a href="/logout">Disconnect</a></li>
                    </ul>
                </div>
            </li>
        </ul>

    </div>
</nav>

<div class="uk-container uk-position-center">
    <form method="post" action="/add-artist">
        <fieldset class="uk-fieldset">

            <legend class="uk-legend">Now you can add artists too!</legend>

            <div class="uk-margin">
                <input class="uk-input" type="text" name="realName" placeholder="Real name" required>
            </div>
            <div class="uk-margin">
                <input class="uk-input" type="text" name="fameName" placeholder="Fame name" required>
            </div>
            <div class="uk-margin">
                <input class="uk-input" type="text" name="birthDate" placeholder="Birthdate (exemple: October 17, 1972)" required>
            </div>
            <div class="uk-margin">
                <input class="uk-input" type="text" name="category" placeholder="Category (exemple: Rapper)" required>
            </div>
            <div class="uk-margin">
                <input class="uk-input" type="text" name="linkToAvatar" placeholder="Link to avatar" maxlength="50" required>
            </div>
            <div class="uk-width-1-1">
                <button type="submit" class="uk-button uk-button-primary uk-width-1-1 ">Add !</button>
            </div>
        </fieldset>
    </form>
</div>
</body>
</html>
