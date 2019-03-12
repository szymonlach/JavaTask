package pl.lach.components.air_conditioning;

import java.math.BigDecimal;

public interface GeneralAirConditioner {

    BigDecimal start(BigDecimal roomVolume, BigDecimal actualTemperature);


}
