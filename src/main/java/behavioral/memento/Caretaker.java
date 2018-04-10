package behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
    private final List<Memento> stateList = new ArrayList<>();

    public void add(Memento memento) {
        stateList.add(memento);
    }

    public Memento getById(int id) {
        return stateList.get(id);
    }
}
