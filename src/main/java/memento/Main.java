package memento;

public class Main {
    public static void main(String[] args) {
        Caretaker caretaker = new Caretaker();

        Originator originator1 = new Originator();
        originator1.setState("ABC");

        Originator originator2 = new Originator();
        originator2.setState("DEF");


        caretaker.add(originator1.saveToMemento());
        caretaker.add(originator2.saveToMemento());
    }
}
