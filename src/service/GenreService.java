package service;

import database.impl.GenreRepository;
import model.Genre;

import java.util.List;

/**
 * @author Elattar Saad
 */
public class GenreService {

    public static List<Genre> findAll(){
        return new GenreRepository().findAll();
    }

}
