package singleton;

/**
 * A Singleton Object
 */
public class SingleObject {

    private static SingleObject instance = new SingleObject();

    /**
     * This object is not supposed to be instantiated by constructor.
     */
    private SingleObject() { }

    public static SingleObject getInstance() {
        return instance;
    }

    public void showMesssage() {
        System.out.println("Hello World!");
    }
}
