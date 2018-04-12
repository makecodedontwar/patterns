package structural.adapter;

public class PolarImpl implements Polar {
    private final Cartesian cartesian;

    public PolarImpl(Cartesian cartesian) {
        this.cartesian = cartesian;
    }


    @Override
    public void setPoint(double r, double theta) {
        cartesian.setPoint(r * Math.cos(theta), r * Math.sin(theta));
    }
}
