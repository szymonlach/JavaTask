package pl.lach;

/**
 *
 *In the program, create a class that represents a single song. Each song should have name and duration information in seconds.
 *In a separate class, eg Playlist, define a method that takes any number of songs (as separate arguments) and returns the total playing time in seconds.
 *Create a test class in which you will display the playing time in the form of HH: mm: ss where H is hours, m are minutes, and s are seconds.
 */
public class Main {
    public static void main(String[] args) {
        Song song1 = new Song("Song1", 3600);
        Song song2 = new Song("Song2", 140);
        Song song3 = new Song("Song3", 50);

        System.out.println(Playlist.playlistDuration(song1,song2,song3));
        System.out.println(Playlist.playlistDuration(song2,song3));
    }
}
