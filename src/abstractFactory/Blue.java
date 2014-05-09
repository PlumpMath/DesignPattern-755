package abstractFactory;

/**
 * {@code Blue} is an implementation of {@code Color}.
 */
public class Blue implements Color{
    @Override
    public void fill() {
        System.out.println("Fill with blue color");
    }
}
