package pl.lach;

import pl.lach.comparators.CompareNickAscending;
import pl.lach.comparators.CompareNickDescending;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * We write a fragment of the application in which we will store statistics of players of a certain computer game.
 * <p>
 * Each player has his nickname (nickname) and number of points.
 * <p>
 * In the program, create an array containing several players, and define several sorting algorithms. It should be possible to sort by the number of points and the nickname both ascending and descending. The default sorting method is after the number of points descending. Test the operation of the algorithms you have defined and display the result after each sort on the screen.
 * <p>
 * Write the program in two versions:
 * <p>
 * 1. Classic version using Comparable and Comparator interfaces (separate classes or anonymous classes),
 * 2. Version with the use of the opportunities offered by new products introduced in Java 8.
 */
public class Main {
    public static void main(String[] args) {
        List<Player> players = Arrays.asList(
                new Player("MAX", 13),
                new Player("Nana", 15),
                new Player("All", 11),
                new Player("Ben", 19));

        // 1.
        Collections.sort(players);
        System.out.println("Sort using Comparable interface (Point descending)");
        players.forEach(n -> System.out.printf("%-5s %s pkt\n", n.getNick(), n.getPoints()));

        Collections.sort(players, new Comparator<Player>() {
            @Override
            public int compare(Player o1, Player o2) {
                return Integer.compare(o1.getPoints(), o2.getPoints());
            }
        });
        System.out.println("Sort using Comparator (Point ascending)");
        players.forEach(n -> System.out.printf("%-5s %s pkt\n", n.getNick(), n.getPoints()));

        Collections.sort(players, new CompareNickDescending());
        System.out.println("Sort using Comparator (Nick descending)");
        players.forEach(n -> System.out.printf("%-5s %s pkt\n", n.getNick(), n.getPoints()));

        Collections.sort(players, new CompareNickAscending());
        System.out.println("Sort using Comparator (Nick ascending)");
        players.forEach(n -> System.out.printf("%-5s %s pkt\n", n.getNick(), n.getPoints()));

        //2.
        Collections.sort(players, (o1, o2) -> Integer.compare(o1.getPoints(),o2.getPoints()));
        System.out.println("Sort using lambda (Point ascending)");
        players.forEach(n -> System.out.printf("%-5s %s pkt\n", n.getNick(), n.getPoints()));

        Collections.sort(players,Comparator.comparingInt(Player::getPoints));
        System.out.println("Sort using Comparator.comparing (Point ascending)");
        players.forEach(n -> System.out.printf("%-5s %s pkt\n", n.getNick(), n.getPoints()));

        Collections.sort(players,Comparator.comparingInt(Player::getPoints).reversed());
        System.out.println("Sort using Comparator.comparing (Point descending)");
        players.forEach(n -> System.out.printf("%-5s %s pkt\n", n.getNick(), n.getPoints()));
    }
}
