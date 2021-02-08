package controller;

import model.Song;
import service.SongService;

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
@WebServlet(name = "SongsServlet", urlPatterns = "/songs")
public class SongsServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getSession().getAttribute("connectedUser") != null) {
            List<Song> songs = SongService.findAll();
            Collections.shuffle(songs);
            request.setAttribute("songs", songs);
            request.setAttribute("connectedUser", request.getSession().getAttribute("connectedUser"));
            request.getRequestDispatcher("view/songs.jsp").forward(request, response);
        }
    }
}
