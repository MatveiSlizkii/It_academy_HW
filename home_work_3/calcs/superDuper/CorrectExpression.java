package home_work_3.calcs.superDuper;

public class CorrectExpression {
    private boolean isCorrect = true;

    public CorrectExpression(String expression) {
        this.isCorrect = isCorrect;
        expression = expression.replaceAll("\\s", ""); //удаление пробелов
        String[] tempExpression = expression.split("");
        for (int i = 0; i < tempExpression.length-1; i++) {
            if (tempExpression[i].equals("+") || tempExpression[i].equals("-") || tempExpression[i].equals("*") || tempExpression[i].equals("/") || tempExpression[i].equals("^")) {
                if (tempExpression[i + 1].equals("+") || tempExpression[i + 1].equals("-") || tempExpression[i + 1].equals("*") || tempExpression[i + 1].equals("/") || tempExpression[i + 1].equals("^")) {
                    this.isCorrect = false;
                    System.out.println("Ошибка дублированные знаки " +tempExpression[i]  + " и " + tempExpression[i + 1]);
                }
            }
        }
    }

    public boolean isCorrect() {
        return isCorrect;
    }
}