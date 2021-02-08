<%--
  Created by IntelliJ IDEA.
  User: Elattar Saad
  Date: 12/27/19
  Time: 20:29
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Music Store - Songs</title>
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
            <li><a href="/artists">ARTISTS</a></li>
            <li class="uk-active"><a href="/songs">NEW SONGS</a></li>
            <li><a href="/add-song">ADD A SONG</a></li>
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
<%-- Songs --%>
<div class="uk-container">
    <table class="uk-table uk-table-hover uk-table-divider">
        <thead>
        <tr>
            <th>Title</th>
            <th>Artist</th>
            <th>Genre</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach var="song" items="${songs}">
            <tr>
                <td>${song.title}</td>
                <td>${song.artist.fameName}</td>
                <td>${song.genre.title}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>


</body>
</html>
