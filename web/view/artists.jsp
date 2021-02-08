<%--
  Created by IntelliJ IDEA.
  User: Elattar Saad
  Date: 12/27/19
  Time: 20:29
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Music Store - Artists</title>
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
            <li class="uk-active"><a href="/artists">ARTISTS</a></li>
            <li><a href="/songs">NEW SONGS</a></li>
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

<%-- ARTISTS --%>
<div class="uk-grid-column-small uk-grid-row-large uk-child-width-1-3@s uk-text-center" uk-grid="masonry: true"
     uk-scrollspy="target: > div; cls: uk-animation-fade; delay: 500">
<c:forEach var="artist" items="${artists}">
        <div class="uk-card uk-card-default uk-card-body">
            <div class="uk-card uk-card-default">
                <div class="uk-card-media-top uk-overflow-hidden">
                    <img src="<c:out value="${artist.linkToAvatar}" />" alt="" style=" height: 50vh;"
                         uk-scrollspy="cls: uk-animation-kenburns; repeat: true">
                </div>
                <div class="uk-card-body">
                    <h3 class="uk-card-title"><c:out value="${artist.fameName}" /></h3>
                    <p class="card-text"><c:out value="${artist.realName}"/></p>
                    <p class="card-text"><c:out value="${artist.birthDate}"/></p>
                    <p class="card-text"><c:out value="${artist.category}"/></p>
<%--                    <button class="uk-button uk-button-default">Go to Albums</button>--%>
                </div>
            </div>
        </div>
</c:forEach>
</div>
</body>
</html>
