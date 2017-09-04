import java.util.*;

public class Hashmatique{
    // Create a trackList of type HashMap
    public HashMap<String, String> trackList = new HashMap<>();

    // Add in at least 4 songs that are stored by title
    public void addSong(String track,String lyrics){
        trackList.put(track, lyrics);
    }
    // Pull out one of the songs by its track title
    public String getSong(String track) {
        System.out.println(track);
        return trackList.get(track);
    }

    // Print out all the track names and lyrics in the format Track: Lyrics
    public void printTrackList(){
        for(Map.Entry<String, String> entry:trackList.entrySet()){
            String key = entry.getKey();
            String value = entry.getValue();

            System.out.println(key+": "+value);

        }
    }
}