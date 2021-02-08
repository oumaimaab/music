package service;

import database.impl.SongRepository;
import model.Song;

import java.util.List;

/**
 * @author Elattar Saad
 */
public class SongService {

    public static void save(Song song){
        new SongRepository().save(song);
    }


    public static List<Song> findAll(){
        return new SongRepository().findAll();
    }
}
