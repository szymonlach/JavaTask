package pl.lach;

public class CabrioTest {
    public static void main(String[] args) {
        Cabrio myCabrio = new Cabrio("XKR","Jaguar");

        System.out.println(myCabrio.toString());
        myCabrio.setOpenRoof(true);
        System.out.println(myCabrio.toString());
        myCabrio.setMoving(true);
        System.out.println(myCabrio.toString());
        myCabrio.setOpenRoof(false);
    }
}
