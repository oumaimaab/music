package controller;

import model.Artist;
import service.ArtistService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author Elattar Saad
 */
@WebServlet(name = "ArtistAddServlet", urlPatterns = "/add-artist")
public class ArtistAddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Artist artist = new Artist(request.getParameter("realName"),request.getParameter("fameName"),request.getParameter("birthDate"),request.getParameter("category"),request.getParameter("linkToAvatar"));
        ArtistService.save(artist);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getSession().getAttribute("connectedUser") != null) {
            request.setAttribute("connectedUser", request.getSession().getAttribute("connectedUser"));
            request.getRequestDispatcher("view/artist_add.jsp").forward(request, response);
        }
    }
}
