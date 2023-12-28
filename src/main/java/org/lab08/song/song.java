package org.lab08.song;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.NoSuchElementException;

class GenreFilterIterator implements Iterator<Song> {
    private ArrayList<Song> playlist = new ArrayList<>();
    private String genre;
    private int index;

    public GenreFilterIterator(ArrayList playlist, String genre) {
        this.playlist = playlist;
        this.genre = genre;
        this.index = 0;
    }

    @Override
    public boolean hasNext(){
        while(this.index < playlist.size()){
            if(playlist.get(this.index).getGenre().equals(this.genre)){
                return true;
            }
            this.index++;
        }
        return false;
    }

    @Override
    public Song next(){
        if(hasNext()){
            return this.playlist.get(index++);
        } else{
            throw new NoSuchElementException();
        }
    }
}
class Song {
    private String title;
    private String artist;
    private String genre;
    public Song(String title, String artist, String genre) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getArtist() {
        return artist;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }

}

class Main {
    public static void main(String[] args){
        ArrayList<Song> playlist = new ArrayList<>();
        playlist.add(new Song("Its me", "Ashiniko", "rap"));
        playlist.add(new Song("Boy like me", "New Medicine", "rock"));


        GenreFilterIterator genreFilterIterator = new GenreFilterIterator(playlist, "rock");
        while(genreFilterIterator.hasNext()){
            Song currentSong = genreFilterIterator.next();
            String artist = (currentSong.getArtist()).toString();
            String title = (currentSong.getTitle()).toString();
            String genre = (currentSong.getGenre()).toString();
            System.out.println(artist + " - " + title + "(" + genre + ")");
        }
    }
}


