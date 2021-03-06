package flyweight;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * Demonstrates flyweight pattern. In most cases, flyweight objects are supposed to be immutable. For instance,
 * a coffee shop could create several flavour object and store them into a {@link java.util.Map}. Therefore,
 * instead of creating a flavour object for every new order, an existing flavour object is able to be fetched from
 * this map.
 *
 * A comparison between the flyweight pattern and the prototype pattern shows some similarities in the UML,
 * in that both use a manager to store and retrieve the objects in the collection. But there is ia clear difference
 * between the two. The prototype pattern is used to create new objects that are similar in nature (hence it's a
 * creational pattern), while the flyweight pattern is used to allow the application to point to the same instance of
 * the object to save memory (hence it's a structural pattern).
 */
public class Demo {

    private static Random randomGenerator = new Random();

    public static void main(String[] args) {
        List<Colors> colorList = Collections.unmodifiableList(Arrays.asList(Colors.values()));

        IntStream.range(0, 20).forEach((e) -> {
            Circle circle = (Circle) ShapeFactory.getCircle(getRandomColor(colorList));
            circle.setX(randomGenerator.nextInt(100));
            circle.setY(randomGenerator.nextInt(30));
            circle.setRadius(randomGenerator.nextInt());
            circle.draw();
        });

    }

    private static Colors getRandomColor(List<Colors> colorList) {
        return colorList.get(randomGenerator.nextInt(colorList.size()));
    }

}
