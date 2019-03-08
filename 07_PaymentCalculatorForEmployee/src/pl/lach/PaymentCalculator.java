package pl.lach;

import java.math.BigDecimal;


public class PaymentCalculator {

    private static final BigDecimal YEARLY_ZUS = BigDecimal.valueOf(12000);

    public static BigDecimal nettoYearPayment(Employee employee) {
        BigDecimal yearNettoPayment = employee.getMonthlyPayment().multiply(BigDecimal.valueOf(12));
        return yearNettoPayment;

    }


    public static BigDecimal bruttoYearPayment(Employee employee) {
        BigDecimal bruttoPayment = employee.getMonthlyPayment().divide(BigDecimal.valueOf(0.8)).multiply(BigDecimal.valueOf(12));
        return bruttoPayment.add(YEARLY_ZUS);
    }
}
