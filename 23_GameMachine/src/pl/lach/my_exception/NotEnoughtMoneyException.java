package pl.lach.my_exception;

public class NotEnoughtMoneyException extends Exception {
    public NotEnoughtMoneyException() {
        super("You don't pay enough money");
    }
}
