package abstractFactory;

/**
 * {@code Green} is an implementation of {@code Color}.
 */
public class Green implements Color {

    @Override
    public void fill() {
        System.out.println("Fill with green color.");
    }
}
