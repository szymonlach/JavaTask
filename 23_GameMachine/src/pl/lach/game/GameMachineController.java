package pl.lach.game;

import java.util.Scanner;

public class GameMachineController {

    private GameMachine gameMachine;

    public GameMachineController(GameMachine gameMachine) {
        this.gameMachine = gameMachine;
    }


    public void startBuyingGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter game name");
        String inputGameTitle = scanner.nextLine();
        System.out.println("Pay the money");
        int inputMoney = scanner.nextInt();
        Game selectedGame = gameMachine.buyGame(inputGameTitle, inputMoney);
        printGame(selectedGame, inputMoney);
    }

    private void printGame(Game selectedGame, int inputMoney) {

        int restMoney = inputMoney - selectedGame.getPrice();
        System.out.println("Take you game: " + selectedGame.getName());
        if (restMoney > 0) {
            System.out.println("Take rest money: " + restMoney);
        }

    }
}
