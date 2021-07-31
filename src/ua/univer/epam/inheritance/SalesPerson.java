package ua.univer.epam.inheritance;

import java.math.BigDecimal;

public class SalesPerson extends Employee {
    private int percent;

    public SalesPerson(String name, BigDecimal salary, int percent) {
        super(name, salary);
        this.percent = percent;
    }


    @Override
    public BigDecimal setBonus(BigDecimal bonus){





        if (this.percent > 100 & this.percent < 200) {
            bonus = super.setBonus(bonus).multiply(new BigDecimal(2));


        }
        if (this.percent > 200) {
            bonus = super.setBonus(bonus).multiply(new BigDecimal(3));
        }
        else super.setBonus(bonus);
        return bonus;
    }


    @Override
    public BigDecimal toPay() {
        return super.toPay();
    }
}
