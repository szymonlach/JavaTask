package pl.lach.my_exception;

public class GameNotFoundException extends RuntimeException {
    public GameNotFoundException() {
        super("Game is not found");
    }
}
