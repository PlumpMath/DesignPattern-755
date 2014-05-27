package state;

/**
 * Context's behavior varies as its state object changes
 */
public class Context {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void doAction() {
        state.doAction();
    }
}
