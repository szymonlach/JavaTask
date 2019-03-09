package pl.lach;

public class Playlist {

    private static final int SENCONDS_IN_HOUR =3600;
    private static final int SENCONDS_IN_MINUTE =60;

    public static String playlistDuration(Song... songs) {
        StringBuilder stringBuilder = new StringBuilder();
        int summaryDurationInSeconds = 0;
        for (int i = 0; i < songs.length; i++) {
            summaryDurationInSeconds += songs[i].getDuration();
        }
        int hours = summaryDurationInSeconds / SENCONDS_IN_HOUR;
        String hoursToShow = timeToString(hours);
        int minutes = (summaryDurationInSeconds - hours * SENCONDS_IN_HOUR) / SENCONDS_IN_MINUTE;
        String minutesToShow = timeToString(minutes);
        int seconds = summaryDurationInSeconds - minutes * SENCONDS_IN_MINUTE - hours * SENCONDS_IN_HOUR;
        String secondsToShow = timeToString(seconds);
        return String.format("%s:%s:%s", hoursToShow, minutesToShow, secondsToShow);
    }

    private static String timeToString(int time) {
        String result;
        if (time < 10) result = "0" + String.valueOf(time);
        else if (time == 0) result = "00";
        else result = String.valueOf(time);
        return result;
    }
}
