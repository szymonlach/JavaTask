package pl.lach;

import java.util.Objects;

public class Player implements Comparable<Player> {

    private String nick;
    private Integer points;

    public Player(String nick, int points) {
        this.nick = nick;
        this.points = points;
    }

    @Override
    public int compareTo(Player o) {
        return -1*this.points.compareTo(o.points);
    }


    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Player)) return false;
        Player player = (Player) o;
        return getPoints() == player.getPoints() &&
                Objects.equals(getNick(), player.getNick());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getNick(), getPoints());
    }

    @Override
    public String toString() {
        return "Player{" +
                "nick='" + nick + '\'' +
                ", points=" + points +
                '}';
    }

}
