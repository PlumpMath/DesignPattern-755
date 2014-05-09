package abstractFactory;

/**
 * {@code Red} is an implementation of {@code Color}.
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Fill with red color.");
    }
}
