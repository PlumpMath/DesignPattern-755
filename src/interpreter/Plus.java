package interpreter;

import java.util.Map;

/**
 * Plus expression returns summation of two operands.
 */
public class Plus implements Expression{
    Expression leftOperand;

    Expression rightOperand;

    public Plus(Expression leftOperand, Expression rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    @Override
    public int interpret(Map<String, Expression> variables) {
        return leftOperand.interpret(variables) + rightOperand.interpret(variables);
    }
}
