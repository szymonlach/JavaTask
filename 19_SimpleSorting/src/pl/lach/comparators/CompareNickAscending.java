package pl.lach.comparators;

import pl.lach.Player;

import java.util.Comparator;

public class CompareNickAscending implements Comparator<Player> {
    @Override
    public int compare(Player o1, Player o2) {
        return o1.getNick().compareTo(o2.getNick());
    }
}
