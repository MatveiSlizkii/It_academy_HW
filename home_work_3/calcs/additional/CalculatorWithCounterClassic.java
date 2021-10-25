package home_work_3.calcs.additional;

import home_work_3.calcs.simple.CalculatorWithMathExtends;

public class CalculatorWithCounterClassic extends CalculatorWithMathExtends {
    long count = 0;

    /**
     * прибвление счетчика
     */
    public void incrementCountOperation(){
        count++;
    }

    /**
     *
     * @return показатель счетчика
     */
    public long getCount() {
        return count;
    }
}
