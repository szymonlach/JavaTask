package pl.lach.game;

import pl.lach.my_exception.GameNotFoundException;
import pl.lach.my_exception.NotEnoughtMoneyException;

import java.util.Set;

public class GameMachine {

   private Set<Game> games;

    public GameMachine(Set<Game> games) {
        this.games = games;
    }

    public Game buyGame(String gameName, int payedMoney) throws GameNotFoundException, NotEnoughtMoneyException {
        Game selectedGame = null;
        for (Game game : games) {
            if (game.getName().equals(gameName)) {
                selectedGame = game;
                break;
            }
        }
        if (selectedGame == null) throw new GameNotFoundException();
        else {
            if (selectedGame.getPrice() > payedMoney) throw new NotEnoughtMoneyException();
        }
        return selectedGame;

    }


    public Set<Game> getGames() {
        return games;
    }
}
