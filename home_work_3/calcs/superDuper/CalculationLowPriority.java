package home_work_3.calcs.superDuper;

public class CalculationLowPriority {
    /*
    вычисляет в последнюю очередь то что + или -
     */

    public double calculationLowPriority(String[] expressionArray) {
        double result = 0;
        for (int i = 1; i < expressionArray.length; i++) {
            if (expressionArray[i] != null && expressionArray[i].equals("+") ) {
                double x = Double.parseDouble(expressionArray[i - 1]) + Double.parseDouble(expressionArray[i + 1]);
                expressionArray[i+1] = String.valueOf(x);
                expressionArray[i] = null;
                expressionArray[i - 1] = null;
                result = Double.parseDouble(expressionArray[i+1]);
            }
            if (expressionArray[i] != null && expressionArray[i].equals("-")) {
                double x = Double.parseDouble(expressionArray[i - 1]) - Double.parseDouble(expressionArray[i + 1]);
                expressionArray[i+1] = String.valueOf(x);
                expressionArray[i] = null;

                result = Double.parseDouble(expressionArray[i+1]);
            }
        }
        return result;
    }


}
