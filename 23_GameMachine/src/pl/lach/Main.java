package pl.lach;

import pl.lach.game.Game;
import pl.lach.game.GameMachine;
import pl.lach.game.GameMachineController;
import pl.lach.my_exception.GameNotFoundException;
import pl.lach.my_exception.NotEnoughtMoneyException;

import java.util.HashSet;
import java.util.Set;

/**
 * We create an application for the machine where you can buy computer games. The machine stores several latest titles. Each game is described by name and price.
 * <p>
 * The operation of the machine is as follows:
 * <p>
 * the user enters on the screen the name of the game he wants to rent
 * the user puts money into the machine (we assume full zloty, no pennies)
 * The user should see in response that the game was successfully purchased or that the game was not found. In addition, if the user has thrown too little money, he should see a message of too little, and if he has paid too much money, he should get the rest.
 * <p>
 * Write the program by defining classes:
 * <p>
 * Game - a single game,
 * GameMachine - stores several games and allows you to buy them. In a situation where a user tries to buy a game that is not in the machine or paid too little money, throw the appropriate exceptions defined by himself in the method supporting the purchase,
 * GameMachineController - interaction class with the user, this is the only place in the program where should be displayed and loading data from the user.
 * In addition, there may be an additional starting class or other classes that you deem appropriate.
 */
public class Main {
    public static void main(String[] args) {

        Set<Game> games = new HashSet<>();
        games.add(new Game("Wither 3", 79));
        games.add(new Game("Heroes 3", 29));
        games.add(new Game("Gothic", 19));

        GameMachine gameMachine = new GameMachine(games);
        GameMachineController gameMachineController = new GameMachineController(gameMachine);
        try {
            gameMachineController.startBuyingGame();
        } catch (NotEnoughtMoneyException | GameNotFoundException e) {
            System.err.println(e.getMessage());
        }

    }
}
