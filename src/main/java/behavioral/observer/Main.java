package behavioral.observer;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();

        subject.register(new ObserverErr());
        subject.register(new ObserverOut());
        subject.notify(new Event());
    }
}
