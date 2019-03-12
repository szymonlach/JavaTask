package pl.lach;

import pl.lach.components.Building;
import pl.lach.components.Room;
import pl.lach.components.air_conditioning.BasicAirConditioner;
import pl.lach.components.air_conditioning.GeneralAirConditioner;
import pl.lach.components.air_conditioning.ProAirConditioner;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Write a program that will simulate temperature control in the premises of a building.
 * <p>
 * The building consists of 4 rooms, and each room can have an independent air conditioner of one of two types:
 * <p>
 * BasicAirConditioner - reduces the room temperature proportionally by 1 degree per minute with a capacity of 1 cubic meter per minute. For example, if a room has a volume of 10 cubic meters, the room temperature will be reduced by 0.1 degree per minute.
 * ProAirConditioner - reduces the room temperature proportionally by 2 degrees per minute at a capacity of 1 cubic meter per minute. For example, if the room has a volume of 10 cubic meters, the room temperature will be reduced by 0.2 degrees per minute.
 * For the purpose of the task, we simulate that 1 minute corresponds to 1 second.
 * <p>
 * In each room you can set the air conditioning to on or off and the temperature to which the temperature is to be lowered.
 * <p>
 * The program should display the temperature in each of the four rooms every second. Every second, the room temperature should be lowered by the appropriate value depending on the air conditioner used. Set up any starting temperature. After lowering the temperature to the set temperature, it should be kept constant.
 */
public class Main {

    private static final BigDecimal TEMPERATURE_30 = BigDecimal.valueOf(30).setScale(2, BigDecimal.ROUND_HALF_DOWN);
    private static final BigDecimal TEMPERATURE_25 = BigDecimal.valueOf(25).setScale(2, BigDecimal.ROUND_HALF_DOWN);
    private static final BigDecimal TEMPERATURE_20 = BigDecimal.valueOf(20).setScale(2, BigDecimal.ROUND_HALF_DOWN);
    private static final BigDecimal TEMPERATURE_15 = BigDecimal.valueOf(15).setScale(2, BigDecimal.ROUND_HALF_DOWN);

    private static final BigDecimal VOLUME_20 = BigDecimal.valueOf(2).setScale(2, BigDecimal.ROUND_HALF_DOWN);
    private static final BigDecimal VOLUME_10 = BigDecimal.valueOf(2).setScale(2, BigDecimal.ROUND_HALF_DOWN);
    private static final BigDecimal VOLUME_5 = BigDecimal.valueOf(2).setScale(2, BigDecimal.ROUND_HALF_DOWN);

    public static void main(String[] args) throws InterruptedException {

        GeneralAirConditioner basicAirConditioner = new BasicAirConditioner();
        GeneralAirConditioner proAirConditioner = new ProAirConditioner();

        List<Room> rooms = new ArrayList<>();
        rooms.add(new Room("Room-1", VOLUME_20, TEMPERATURE_30, basicAirConditioner));
        rooms.add(new Room("Room-2", VOLUME_10, TEMPERATURE_25, basicAirConditioner));
        rooms.add(new Room("Room-3", VOLUME_10, TEMPERATURE_25, proAirConditioner));
        rooms.add(new Room("Room-4", VOLUME_5, TEMPERATURE_20, basicAirConditioner));

        Building building = new Building(rooms);

        rooms.forEach(n -> n.setAirConditionerIsRuning(true));

        while (true) {
            StringBuilder finalStringBuilder = new StringBuilder();
            rooms.forEach(n -> finalStringBuilder.append(n.runAirConditioner(TEMPERATURE_15)));
            System.out.println(finalStringBuilder.toString());

            Thread.sleep(1000);
        }


    }
}
