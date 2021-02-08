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
    <title>Music Store - Add a song</title>
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
            <li class="uk-active"><a href="/add-song">ADD A SONG</a></li>
            <li><a href="/add-artist">ADD AN ARTIST</a></li>
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
    <form method="post" action="/add-song">
        <fieldset class="uk-fieldset">

            <legend class="uk-legend">Now you can add songs too!</legend>

            <div class="uk-margin">
                <input class="uk-input" type="text" name="title" placeholder="Title">
            </div>
            <div class="uk-margin">
                <select class="uk-select" name="artist" required>
                    <option selected disabled>Artist</option>
                    <c:forEach var="artist" items="${artists}">
                        <option value="${artist.id}" >${artist.fameName}</option>
                    </c:forEach>
                </select>
            </div>

            <div class="uk-margin">
                <select class="uk-select" name="genre" required>
                    <option selected disabled>Genre</option>
                    <c:forEach var="genre" items="${genres}">
                        <option value="${genre.id}">${genre.title}</option>
                    </c:forEach>
                </select>
            </div>
            <div class="uk-width-1-1">
                <button type="submit" class="uk-button uk-button-primary uk-width-1-1 ">Add !</button>
            </div>
        </fieldset>
    </form>
</div>
</body>
</html>
