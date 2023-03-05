import java.util.ArrayList;

public class Song {
    private String title;
    private String artist;
    private ArrayList<String> listeners = new ArrayList<>();

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

    public int howMany(ArrayList<String> people) {
        int newFans = 0;
        for(String person: people) {
            String update = person.toLowerCase();
            if (!listeners.contains(update)) {
                listeners.add(update);
                newFans++;
            }
        }
        return newFans;
    }

    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    @Override
    public String toString() {
        return "Song{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }
}
