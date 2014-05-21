package interpreter;

import java.util.Map;

/**
 * Variable expression returns interpreted result of given variable name
 */
public class Variable implements Expression {
    private String name;

    public Variable(String name) {
        this.name = name;
    }

    @Override
    public int interpret(Map<String, Expression> variables) {
        if (variables.containsKey(name)) {
            return variables.get(name).interpret(variables);
        }
        return 0;
    }
}
