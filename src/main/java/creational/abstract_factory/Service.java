package creational.abstract_factory;

public class Service {
    private final Button button;


    public Service(GUIFactory guiFactory) {
        this.button = guiFactory.createButton();
    }

    public void pressButton() {
        button.printName();
    }
}
