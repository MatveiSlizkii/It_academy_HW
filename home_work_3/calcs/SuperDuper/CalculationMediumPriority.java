package home_work_3.calcs.SuperDuper;

public class CalculationMediumPriority {
    /*
    вычисляет в медиум приоритет *,/,^
     */

    public void  calculationMediumPriority(String[] expressionArray) {
        for (int i = 1; i < expressionArray.length; i++) {
            if (expressionArray[i] != null && expressionArray[i].equals("*") ) {
                double x = Double.parseDouble(expressionArray[i - 1]) * Double.parseDouble(expressionArray[i + 1]);
                expressionArray[i+1] = String.valueOf(x);
                expressionArray[i] = null;
                expressionArray[i - 1] = null;
            }
            if (expressionArray[i] != null && expressionArray[i].equals("/")) {
                double x = Double.parseDouble(expressionArray[i - 1]) / Double.parseDouble(expressionArray[i + 1]);
                expressionArray[i+1] = String.valueOf(x);
                expressionArray[i] = null;
                expressionArray[i - 1] = null;
            }
            if (expressionArray[i] != null && expressionArray[i].equals("^")) {
                double x = Math.pow(Double.parseDouble(expressionArray[i - 1]), Double.parseDouble(expressionArray[i + 1]));
                expressionArray[i+1] = String.valueOf(x);
                expressionArray[i] = null;
                expressionArray[i - 1] = null;
            }
        }
        SortedNull sortedNull = new SortedNull();
        sortedNull.sortNull(expressionArray);
    }

}
