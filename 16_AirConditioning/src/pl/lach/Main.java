package pl.lach;

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
    public static void main(String[] args) {
        
    }
}
