package org.login.com.finalcalculator_2;

public class Calculation  implements ICalculation{
    @Override
    public int add(Values values) {
        return values.getFirstValue()+values.getSecondValue();
    }

    @Override
    public int sub(Values values) {
        return 0;
    }

    @Override
    public int mul(Values values) {
        return 0;
    }

    @Override
    public int div(Values values) {
        return 0;
    }
}
