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

    public String runAirConditioner(BigDecimal desiredTemperature) {
        if (airConditionerIsRuning) {
            if (actualTemperature.compareTo(desiredTemperature) > 0) {
                actualTemperature = airConditioner.start(roomVolume, actualTemperature);
            }
        }
        return roomName + " temperature: " + actualTemperature + "   ";
    }

    public void setAirConditionerIsRuning(boolean airConditionerIsRuning) {
        this.airConditionerIsRuning = airConditionerIsRuning;
    }

    public String getRoomName() {
        return roomName;
    }

    public BigDecimal getRoomVolume() {
        return roomVolume;
    }

    public BigDecimal getActualTemperature() {
        return actualTemperature;
    }

    public GeneralAirConditioner getAirConditioner() {
        return airConditioner;
    }

    public boolean isAirConditionerIsRuning() {
        return airConditionerIsRuning;
    }
}
