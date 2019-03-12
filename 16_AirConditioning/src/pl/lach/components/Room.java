package pl.lach.components;

import pl.lach.components.air_conditioning.GeneralAirConditioner;

import java.math.BigDecimal;

public class Room {

    private String roomName;
    private BigDecimal roomVolume;
    private BigDecimal actualTemperature;
    private GeneralAirConditioner airConditioner;
    private boolean airConditionerIsRuning;

    public Room(String roomName, BigDecimal roomVolume, BigDecimal actualTemperature, GeneralAirConditioner airConditioner) {
        this.roomName = roomName;
        this.roomVolume = roomVolume;
        this.actualTemperature = actualTemperature;
        this.airConditioner = airConditioner;
        this.airConditionerIsRuning = false;
    }

    public void runAirConditioner(BigDecimal desiredTemperature) {
        airConditionerIsRuning = true;
        while (airConditionerIsRuning) {
            actualTemperature = airConditioner.start(roomVolume, actualTemperature);
            System.out.println("The temperature in room " + roomName + " is " + actualTemperature.toString());
            if (actualTemperature.equals(desiredTemperature)) airConditionerIsRuning = false;
        }

    }
}
