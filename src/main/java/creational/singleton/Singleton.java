package creational.singleton;

public class Singleton {
    private static Singleton singleton;

    private String message;

    private Singleton() {

    }

    public static Singleton getSingleton() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
