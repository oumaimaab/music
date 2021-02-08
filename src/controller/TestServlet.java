package controller;

import database.impl.ArtistRepository;
import database.impl.GenreRepository;
import database.impl.SongRepository;
import database.impl.UserRepository;
import model.Artist;
import model.Genre;
import model.Song;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**
 * @author Elattar Saad
 */
@WebServlet(name = "TestServlet", urlPatterns = "/test")

public class TestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {




//        ArtistRepository artistRepository = new ArtistRepository();
//        artistRepository.save(new Artist("Marshal Bruce Mathers III", "Eminem", "October 17, 1972", "Rapper","https://www.eminem.pro/en/wp-content/uploads/2019/08/Kamikaze.jpg"));
//        artistRepository.save(new Artist("Tupac Amaru Shakur", "Tupac", "June 16, 1971", "Rapper","http://www.gstatic.com/tv/thumb/persons/63862/63862_v9_ba.jpg"));
//        artistRepository.save(new Artist("Christopher George Latore Wallace", "Biggie", "May 21, 1972", "Rapper","https://www.billboard.com/files/styles/article_main_image/public/media/notorious-big-jan-18-billboard-1548.jpg"));
//        artistRepository.save(new Artist("Shawn Corey Carter", "Jay-z", "December 4, 1969", "Rapper","http://www.gstatic.com/tv/thumb/persons/199253/199253_v9_bb.jpg"));
//        artistRepository.save(new Artist("Calvin Cordozar Broadus Jr.", "Snoop Dogg", "October 20, 1971", "Rapper","https://official.fm/wp-content/uploads/2018/06/snoop-dogg.jpg"));
//        artistRepository.save(new Artist("Dwayne Michael Carter Jr", "Lil Wayne", "September 27, 1982", "Rapper","https://nyppagesix.files.wordpress.com/2019/12/191224-lil-wayne-plane.jpg?quality=80&strip=all&w=618&h=410&crop=1"));
//        artistRepository.save(new Artist("Nasir bin Olu Dara Jones", "Nas", "September 14, 1973", "Rapper","https://www.clashmusic.com/sites/default/files/styles/article_feature/public/field/image/Nas_%C2%A9DannyClinch2.jpeg?itok=ZL-_07b5"));
//        artistRepository.save(new Artist("Christopher Lee Rios", "Big Pun", "November 10, 1971", "Rapper","https://www.celebsolino.com/wp-content/uploads/2019/06/Big-Pun-Net-Worth-Bio-Age-Height.jpg"));
//        artistRepository.save(new Artist("Curtis James Jackson III", "50 Cent", "July 6, 1975", "Rapper","https://townsquare.media/site/812/files/2019/02/50-Cent-Afraid-of-NYPD-After-Threats.jpg?w=980&q=75"));
//        artistRepository.save(new Artist("Felipe Andres Coronel", "Immortal Technique", "February 19, 1978", "Rapper","https://upload.wikimedia.org/wikipedia/commons/5/54/Immortal_Technique_performing_in_2010.jpg"));
//
//
//
//        artistRepository.save(new Artist("Sarah Grace McLaughlin", "Bishop Briggs", "July 18, 1992", "Singer/SongWriter","https://upload.wikimedia.org/wikipedia/commons/6/69/Bishop_Briggs_Los_Angeles_2017.jpg"));
//        artistRepository.save(new Artist("Laura Pergolizzi", "LP", "March 18, 1981", "Singer/SongWriter","https://www.weculte.com/wp-content/uploads/2019/01/LP_album-heart-to-mouth-we-culte.jpg"));
//        artistRepository.save(new Artist("Holly Brook Hafermann", "Skylar Grey", "February 23, 1986", "Singer/SongWriter","https://bodyartguru.com/wp-content/uploads/2019/07/Skylar-Grey.jpg"));
//        artistRepository.save(new Artist("Sia Kate Isobelle Furler", "Sia", "December 18, 1975", "Singer/SongWriter","https://i0.wp.com/post.healthline.com/wp-content/uploads/2019/10/Sia_1296x728-header-1-1296x728.jpg?w=1155&h=1528"));
//        artistRepository.save(new Artist("Michael Joseph Jackson", "Michael Jackson", "August 29, 1958", "Singer/SongWriter","http://www.gstatic.com/tv/thumb/persons/512227/512227_v9_bb.jpg"));
//        artistRepository.save(new Artist("Beyoncé Giselle Knowles-Carter", "Beyoncé", "September 4, 1981", "Singer/SongWriter","https://www.grammy.com/sites/com/files/styles/image_landscape_hero/public/beyonce-hero-487073444_copy.jpg?itok=HTsVCEqU"));









//        new GenreRepository().saveOrUpdate(new Genre("Rap"));
//        new GenreRepository().saveOrUpdate(new Genre("Pop"));
//        new GenreRepository().saveOrUpdate(new Genre("Rock"));
//        new GenreRepository().saveOrUpdate(new Genre("Soul"));
//        new GenreRepository().saveOrUpdate(new Genre("Country"));
//        new GenreRepository().saveOrUpdate(new Genre("RnB"));
//        new GenreRepository().saveOrUpdate(new Genre("EDM"));
//        new GenreRepository().saveOrUpdate(new Genre("Blues"));
//        new GenreRepository().saveOrUpdate(new Genre("Funk"));
//        new GenreRepository().saveOrUpdate(new Genre("Techno"));


    }
}
