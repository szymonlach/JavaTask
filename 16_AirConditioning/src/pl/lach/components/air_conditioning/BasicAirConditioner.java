package pl.lach.components.air_conditioning;

import java.math.BigDecimal;

public class BasicAirConditioner implements GeneralAirConditioner {
    @Override
    public BigDecimal start(BigDecimal roomVolume, BigDecimal actualTemperature) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return actualTemperature.subtract(BigDecimal.ONE.setScale(2,BigDecimal.ROUND_HALF_DOWN).divide(roomVolume));
    }
}
