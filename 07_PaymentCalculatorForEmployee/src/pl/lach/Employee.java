package pl.lach;

import java.math.BigDecimal;
import java.util.Objects;

public class Employee {

    private String firstName;
    private String surName;
    private BigDecimal monthlyPayment;

    public Employee(String firstName, String surName, BigDecimal monthlyPayment) {
        this.firstName = firstName;
        this.surName = surName;
        this.monthlyPayment = monthlyPayment;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public BigDecimal getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(BigDecimal monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return Objects.equals(getFirstName(), employee.getFirstName()) &&
                Objects.equals(getSurName(), employee.getSurName()) &&
                Objects.equals(getMonthlyPayment(), employee.getMonthlyPayment());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getFirstName(), getSurName(), getMonthlyPayment());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", surName='" + surName + '\'' +
                ", monthlyPayment=" + monthlyPayment +
                '}';
    }
}
