package observer;

/**
 * Observer abstract class
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
