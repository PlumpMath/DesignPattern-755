package state;

/**
 * This class implements {@code State} interface
 */
public class StartState implements State {

    @Override
    public void doAction() {
        System.out.println("Player is in start state.");
    }

}
