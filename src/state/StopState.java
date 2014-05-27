package state;

/**
 * This class implements {@code State} interface
 */
public class StopState implements State {

    @Override
    public void doAction() {
        System.out.println("Player is in stop state.");
    }

}
