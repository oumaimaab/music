package controller;

import com.sun.tools.javah.Gen;
import model.Artist;
import model.Genre;
import model.Song;
import service.ArtistService;
import service.GenreService;
import service.SongService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author Elattar Saad
 */
@WebServlet(name = "SongAddServlet", urlPatterns = "/add-song")
public class SongAddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Artist artist = new Artist();
        artist.setId(Long.parseLong(request.getParameter("artist")));
        Genre genre = new Genre();
        genre.setId(Long.parseLong(request.getParameter("genre")));
        Song song = new Song(request.getParameter("title"),artist,genre);
        SongService.save(song);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getSession().getAttribute("connectedUser") != null) {
            List<Artist> artists = ArtistService.findAll();
            List<Genre> genres = GenreService.findAll();
            request.setAttribute("artists", artists);
            request.setAttribute("genres", genres);
            request.setAttribute("connectedUser", request.getSession().getAttribute("connectedUser"));
            request.getRequestDispatcher("view/song_add.jsp").forward(request, response);
        }
    }
}
