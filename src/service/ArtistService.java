package service;

import database.impl.ArtistRepository;
import model.Artist;

import java.util.List;

/**
 * @author Elattar Saad
 */
public class ArtistService {


    public static void save(Artist artist){
        new ArtistRepository().save(artist);
    }


    public static List<Artist> findAll(){
        ArtistRepository artistRepository = new ArtistRepository();
        return artistRepository.findAll();
    }



}
