package pl.lach.components.air_conditioning;

import java.math.BigDecimal;

public class ProAirConditioner implements GeneralAirConditioner {
    @Override
    public BigDecimal start(BigDecimal roomVolume, BigDecimal actualTemperature) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return actualTemperature.subtract(BigDecimal.valueOf(2).setScale(2, BigDecimal.ROUND_HALF_DOWN).divide(roomVolume));
    }
}
