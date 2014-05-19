package proxy;

/**
 * {@code RealImage} implements {@code Image} interface
 */
public class RealImage implements Image{

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading new image from " + fileName + ".");
    }

    @Override
    public void display() {
        System.out.println("Displaying image " + fileName + ".");
    }
}
