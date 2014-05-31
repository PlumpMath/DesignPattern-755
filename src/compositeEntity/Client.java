package compositeEntity;

import java.util.stream.Stream;

/**
 * Client uses composite entiry
 */
public class Client {

    private CompositeEntity compositeEntity = new CompositeEntity();

    public void printData() {
        Stream.of(compositeEntity.getData()).forEach(data -> System.out.println("Data: " + data));
    }

    public void setData(String data1, String data2) {
        compositeEntity.setData(data1, data2);
    }
}
