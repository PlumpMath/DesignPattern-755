package compositeEntity;

/**
 * This object contains dependent objects. It has its own life cycle and also manage life cycle of dependent objects.
 */
public class CoarseGrainedObject {

    DependentObject1 object1 = new DependentObject1();
    DependentObject2 object2 = new DependentObject2();

    public void setData(String data1, String data2) {
        object1.setData(data1);
        object2.setData(data2);
    }

    public String[] getData() {
        return new String[] {object1.getData(), object2.getData()};
    }
}
