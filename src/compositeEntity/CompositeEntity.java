package compositeEntity;

/**
 * It is primary entity bean. It can be coarse grained or can contain a corse grained object to be used for
 * persistence purpose.
 */
public class CompositeEntity {
    private CoarseGrainedObject coarseGrainedObject = new CoarseGrainedObject();

    public void setData(String data1, String data2) {
        coarseGrainedObject.setData(data1, data2);
    }

    public String[] getData() {
        return coarseGrainedObject.getData();
    }
}
