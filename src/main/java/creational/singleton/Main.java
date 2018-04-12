package creational.singleton;

public class Main {

    public static void main(String[] args) {
        Singleton.getSingleton().setMessage("dasdaf");

        System.out.println(Singleton.getSingleton().getMessage());
    }
}
