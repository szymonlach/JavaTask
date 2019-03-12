package pl.lach.components.air_conditioning;

import java.math.BigDecimal;

public class BasicAirConditioner implements GeneralAirConditioner {
    @Override
    public BigDecimal start(BigDecimal roomVolume, BigDecimal actualTemperature) {
        return actualTemperature.subtract(BigDecimal.ONE.divide(roomVolume,2,BigDecimal.ROUND_HALF_DOWN));
    }
}
