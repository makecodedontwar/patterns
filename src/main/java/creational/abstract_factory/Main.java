package creational.abstract_factory;

public class Main {
    public static void main(String[] args) {
        Service osxService = new Service(new OSXGUIFactory());
        Service winService = new Service(new WinGUIFactory());

        osxService.pressButton();
        winService.pressButton();
    }
}
