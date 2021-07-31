package ua.univer.epam.inheritance;

import java.math.BigDecimal;

public class Manager extends Employee {
    private int quantity;
    private int clientAmount;


    public Manager(String name, BigDecimal salary, int quantity) {
        super(name, salary);
        this.quantity = quantity;
        this.clientAmount = clientAmount;
    }

    @Override
    public BigDecimal setBonus(BigDecimal bonus) {

        if (quantity > 100 & quantity < 150) {
            bonus = super.setBonus(bonus).add(new BigDecimal(500));
        }
        if (quantity > 150) {
            bonus = super.setBonus(bonus).add(new BigDecimal(1000));
        }
        else super.setBonus(bonus);
        return bonus;

    }

    @Override
    public BigDecimal toPay() {
        return super.toPay();
    }
}
