<%
if (session.getAttribute("connectedUser")==null){
    response.sendRedirect("/authentication");
}else{
    response.sendRedirect("/artists");
}
%>