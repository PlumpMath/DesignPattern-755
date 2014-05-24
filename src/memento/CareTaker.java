package memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Caretaker object is responsible for restoring object state from memento.
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento get(int index) {
        return mementoList.get(index);
    }
}
