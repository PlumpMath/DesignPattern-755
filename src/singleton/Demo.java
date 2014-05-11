package singleton;

/**
 * Singleton pattern demo
 */
public class Demo {
    public static void main(String[] args) {
        SingleObject instance = SingleObject.getInstance();
        instance.showMesssage();
    }
}
