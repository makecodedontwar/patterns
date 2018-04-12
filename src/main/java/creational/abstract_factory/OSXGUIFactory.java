package creational.abstract_factory;

public class OSXGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new OSXButton();
    }
}
