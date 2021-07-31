package ua.univer.epam.inheritance;

import java.math.BigDecimal;

public class Employee {
    private String name;
    private BigDecimal salary;
    private BigDecimal bonus;

    public String getName() {
        return name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public Employee(String name, BigDecimal salary) {
        this.name = name;
        this.salary = salary;
    }

    public Employee() {
    }

    public BigDecimal getBonus() {
        return bonus;
    }

//    public void setBonus(BigDecimal bonus) {
//        this.bonus = bonus;
//    }

    public BigDecimal setBonus(BigDecimal b) {
    bonus = b;

        return bonus;

    }


    public BigDecimal ToPay() {
        return salaryadd(setBonus(bonus));

    }

}
