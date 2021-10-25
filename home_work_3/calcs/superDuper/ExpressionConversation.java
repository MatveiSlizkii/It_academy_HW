package home_work_3.calcs.superDuper;

public class ExpressionConversation {
private String[] expressionArray;
private String expression;

    public ExpressionConversation(String expression) {
        this.expression = expression;
        this.expression = this.expression.replaceAll("\\s", ""); //удаление пробелов

                /*
        расставляет правильно пробелы
         */
        String[] tempExpression = this.expression.split("");
        for (int i = 1; i < tempExpression.length; i++) {
            if (tempExpression[i].matches("[(-+]") || tempExpression[i].equals("/") || tempExpression[i].equals("-") || tempExpression[i].equals("|") || tempExpression[i].equals("^")) {
                /*
                нижни иф для нахождения отрицательных чисел
                 */
                if ((tempExpression[i].equals("-") && tempExpression[i - 2].equals("(")) || (tempExpression[i].equals("-") && tempExpression[i - 2].equals("|"))) {
                } else {
                    this.expression = this.expression.substring(0, i + 1) + " " + this.expression.substring(i + 1);
                    tempExpression = this.expression.split("");
                }

            }

        }

        for (int i = tempExpression.length - 1; i > -1; i--) {
            if (tempExpression[i].matches("[(-+]") || tempExpression[i].equals("/") || tempExpression[i].equals("-") || tempExpression[i].equals("|") || tempExpression[i].equals("^")) {
                this.expression = this.expression.substring(0, i) + " " + this.expression.substring(i);
                tempExpression = this.expression.split("");
            }

        }


        /*
        удаляем лишний пробелы
         */
        this.expression = this.expression.replaceAll("\\s+", " ");
                /*
        создаем стринг массив
         */
        this.expressionArray = this.expression.split(" ");
    }

    public String[] getExpressionArray() {
        return expressionArray;
    }
}
