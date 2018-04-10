package behavioral.memento;

public class Originator {
    private String state;

    public Originator setState(String state) {
        this.state = state;
        return this;
    }

    public Memento saveToMemento() {
        return new Memento(this.state);
    }

    public Originator restoreFromState(Memento memento) {
        return new Originator().setState(memento.getSavedState());
    }

    @Override
    public String toString() {
        return "Originator{" +
                "state='" + state + '\'' +
                '}';
    }
}
