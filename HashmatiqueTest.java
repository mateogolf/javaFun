import java.util.*;

public class HashmatiqueTest{
    public static void main(String[] args) {
        Hashmatique songs = new Hashmatique();
        // Add in at least 4 songs that are stored by title
        songs.addSong("Song1", "Hello World, these lyrics suck.");
        songs.addSong("Song2", "I am Batman!!");
        songs.addSong("Song3", "Cowabunga");
        songs.addSong("Song4", "This is the song that never ends. It goes on and on, my friends...");
        // Pull out one of the songs by its track title
        String lyrics4 = songs.getSong("Song4");
        System.out.println(lyrics4);
        // Print out all the track names and lyrics in the format Track: Lyrics
        songs.printTrackList();
    }
}