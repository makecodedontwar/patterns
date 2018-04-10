package memento;

public class Memento {
    private final String state;


    public Memento(String state) {
        this.state = state;
    }

    public String getSavedState() {
        return this.state;
    }

    @Override
    public String toString() {
        return "Memento{" +
                "state='" + state + '\'' +
                '}';
    }
}
