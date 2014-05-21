package interpreter;

import java.util.Map;

/**
 * Expression interface
 */
public interface Expression {
    public int interpret(Map<String, Expression> variables);
}
