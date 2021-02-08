package database.impl;

import database.AbstractRepository;
import model.Artist;
import model.Song;
/**
 * @author Elattar Saad
 */
public class SongRepository extends AbstractRepository<Song> {
    @Override
    public void save(Song song) {
        song.setArtist(new ArtistRepository().find(song.getArtist().getId()));
        song.setGenre(new GenreRepository().find(song.getGenre().getId()));
        super.save(song);
    }
}
