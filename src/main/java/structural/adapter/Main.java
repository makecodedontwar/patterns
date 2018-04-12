package structural.adapter;

public class Main {
    public static void main(String[] args) {

        Polar adapter = new PolarImpl(new CartesianImpl());

        adapter.setPoint(0, 42);
        adapter.setPoint(1, Math.PI / 2);
        adapter.setPoint(2, Math.PI);
    }
}
