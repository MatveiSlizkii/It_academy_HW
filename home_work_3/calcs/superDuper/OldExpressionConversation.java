package home_work_3.calcs.superDuper;

public class OldExpressionConversation {
    private String[] operands; //числа
    private String[] operators; //символы

    public OldExpressionConversation(String expression) { //конструктор
        this.operands = expression.split("[\\+\\-\\/\\*\\^\\|\\(\\)]+"); //числа
        this.operators = expression.split("[0-9\\.]+"); //символы
        String forOperators = "";
        for (String element : operators) {
            forOperators += element;
        }
        this.operators = forOperators.split("");
    }

    public String[] getOperands() {
        return operands;
    }

    public String[] getOperators() {
        return operators;
    }
}
