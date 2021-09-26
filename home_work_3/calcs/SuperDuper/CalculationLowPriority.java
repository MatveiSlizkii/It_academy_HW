package home_work_3.calcs.SuperDuper;

public class CalculationLowPriority {
    /*
    вычисляет в последнюю очередь то что + или -
     */
    private double answer;
    public CalculationLowPriority(String[] expressionArray) {
        for (int i = 1; i < expressionArray.length; i++) {
            if (expressionArray[i] != null && expressionArray[i].equals("+") ) {
                double x = Double.parseDouble(expressionArray[i - 1]) + Double.parseDouble(expressionArray[i + 1]);
                expressionArray[i+1] = String.valueOf(x);
                expressionArray[i] = null;
                expressionArray[i - 1] = null;
            }
            if (expressionArray[i] != null && expressionArray[i].equals("-")) {
                double x = Double.parseDouble(expressionArray[i - 1]) - Double.parseDouble(expressionArray[i + 1]);
                expressionArray[i+1] = String.valueOf(x);
                expressionArray[i] = null;
                expressionArray[i - 1] = null;
            }
        }

        this.answer = Double.parseDouble(expressionArray[expressionArray.length-1]);
    }

    public double getAnswer() {
        return answer;
    }
}
