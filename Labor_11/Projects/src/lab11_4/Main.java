package lab11_4;

public class Main {
    public static void main(String[] args) {
        String[] expressions = {
                "1 2 + 3 2 + * ",   // 15.0
                "1 2 + +",          // POSTFIX
                "1 a +",            // OPERAND
                "1 2,3 *",          // OPERAND
                "1 3 /"             // 0.333
        };

        for (String expr : expressions) {
            try {
                System.out.println("Eval (" + expr + "): " + IExpression.evaluate(expr) + "\n");
            } catch (ExpressionException e) {
                System.out.println("Wrong expression: " + expr);
                System.out.println("\t" + e.getMessage() + "\n");
            }
        }
    }
}
