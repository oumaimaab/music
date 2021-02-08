package controller;

import model.Artist;
import service.ArtistService;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/**
 * @author Elattar Saad
 */
@WebServlet(name = "ArtistsServlet", urlPatterns = "/artists")
public class ArtistsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Artist> artists = ArtistService.findAll();
        Collections.shuffle(artists);
        request.setAttribute("artists", artists);
        request.setAttribute("connectedUser", request.getSession().getAttribute("connectedUser"));
        request.getRequestDispatcher("view/artists.jsp").forward(request, response);
    }
}
