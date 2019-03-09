package pl.lach;

public class Playlist {

    public static String playlistDuration(Song... songs) {
        StringBuilder stringBuilder = new StringBuilder();
        int summaryDurationInSeconds = 0;
        for (int i = 0; i < songs.length; i++) {
            summaryDurationInSeconds += songs[i].getDuration();
        }
        int hours = summaryDurationInSeconds / 3600;
        String hoursToShow;
        if (hours < 10) hoursToShow = "0" + String.valueOf(hours);
        else hoursToShow = String.valueOf(hours);
        int minutes = (summaryDurationInSeconds - hours * 3600) / 60;
        String minutesToShow;
        if (minutes < 10) minutesToShow = "0" + String.valueOf(minutes);
        else minutesToShow = String.valueOf(minutes);
        int seconds = summaryDurationInSeconds - minutes * 60 - hours * 3600;
        String secondsToShow;
        if (seconds < 10) secondsToShow = "0" + String.valueOf(seconds);
        else secondsToShow = String.valueOf(seconds);
        return String.format("%s:%s:%s", hoursToShow, minutesToShow, secondsToShow);

    }
}
