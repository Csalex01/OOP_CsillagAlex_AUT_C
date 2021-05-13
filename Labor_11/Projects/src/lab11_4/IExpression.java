package lab11_4;

public interface IExpression {

    static double evaluate(String expression) throws ExpressionException {
        Stack operation = new Stack(expression.length());

        String[] items = expression.split(" ");

        for (String i : items) {
            if (IExpression.isOperator(i.trim())) {
                try {
                    Double operand_right = (Double) operation.pop();
                    Double operand_left = (Double) operation.pop();
                    double result = 0.0;

                    switch (i) {
                        case "*" -> result = operand_left * operand_right;
                        case "/" -> result = operand_left / operand_right;
                        case "+" -> result = operand_left + operand_right;
                        case "-" -> result = operand_left - operand_right;
                    }

                    operation.push(result);

                } catch (StackException e) {
                    throw new ExpressionException("WRONG POSTFIX EXCEPTION");
                }

            } else {
                try {
                    operation.push(Double.parseDouble(i));
                } catch (NumberFormatException e) {
                    throw new ExpressionException("WRONG OPERAND");
                } catch (StackException e) {
                    throw new ExpressionException("WRONG POSTFIX EXCEPTION");
                }
            }
        }

        try {
            return (double) operation.top();
        } catch (StackException e) {
            throw new ExpressionException("WRONG POSTFIX EXCEPTION");
        }
    }

    static boolean isOperator(String operator) {
        return "*/+-".contains(operator);
    }

}
