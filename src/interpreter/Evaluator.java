package interpreter;

import java.util.Map;
import java.util.Stack;

/**
 * @author Yang Song
 */
public class Evaluator implements Expression {
    private Expression syntaxTree;

    public Evaluator(String expression) {
        Stack<Expression> expressionStack = new Stack<>();
        for (String token : expression.split(" ")) {
            switch (token) {
                case "+":
                    Expression plusExpression = new Plus(expressionStack.pop(), expressionStack.pop());
                    expressionStack.push(plusExpression);
                    break;
                case "-":
                    // For subtraction expression a - b, a will be pushed before b. Thus,
                    // b(right expression) should be popped earlier.
                    Expression rightExpression = expressionStack.pop();
                    Expression leftExpression = expressionStack.pop();
                    Expression subExpression = new Minus(leftExpression, rightExpression);
                    expressionStack.push(subExpression);
                    break;
                default:
                    expressionStack.push(new Variable(token));
                    break;
            }

        }
        syntaxTree = expressionStack.pop();
    }

    @Override
    public int interpret(Map<String, Expression> variables) {
        return syntaxTree.interpret(variables);
    }
}
