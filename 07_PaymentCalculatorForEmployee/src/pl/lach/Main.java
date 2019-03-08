package pl.lach;

import java.math.BigDecimal;

/**
 * Write a program that will consist of several classes.
 * <p>
 * Employee - represents an employee, should have at least fields to store name, surname and monthly salary
 * PaymentCalculator - wage calculator that has the netEearPayment and grossYearPayment method. Both methods should take an Employee type as an argument. The first one returns the annual sum of payments of a given employee, while the second one returns the annual sum of payments together with additional taxes (ZUS, taxes to the tax office). For simplicity, we assume that the monthly cost of ZUS is PLN 1000 and the income tax is 20%.
 * In the test class, create at least one employee and calculate his annual payment and the annual total cost of the employer.
 * <p>
 * For example, for an employee earning monthly PLN 3000, we should receive:
 * <p>
 * PLN 36000 - because 3000 * 12 = 36000
 * <p>
 * PLN 57000 - for 12 * 1000 + 12 * 3750 = 57000, where 3750 is the gross payment (3750 - 20% * 3750 = 3000 net)
 */
public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee("Marcin", "Nowak", BigDecimal.valueOf(3000));

        System.out.println(PaymentCalculator.nettoYearPayment(employee));
        System.out.println(PaymentCalculator.bruttoYearPayment(employee));
    }
}
