package structural.adapter;

public class CartesianImpl implements Cartesian {
    @Override
    public void setPoint(double x, double y) {
        System.out.println(String.format("X: %s, Y: %s", x, y));
    }
}
