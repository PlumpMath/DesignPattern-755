package state;

/**
 * Demonstrates state pattern
 */
public class Demo {

    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new StartState());

        context.doAction();

        context.setState(new StopState());
        context.doAction();
    }
}
