package behavioral.observer;

public class ObserverErr implements Observer {
    @Override
    public void notify(Event event) {
        System.out.println(this.getClass());
    }
}
