package observer;

public class ObserverOut implements Observer {
    @Override
    public void notify(Event event) {
        System.out.println(this.getClass());
    }
}
