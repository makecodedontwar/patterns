package structural.composite;

public class Main {
    public static void main(String[] args) {
        UnitsGroup group = new UnitsGroup();

        group.addUnit(new Panzer());
        group.addUnit(new Soldier());
        group.addUnit(new Panzer());


        group.attack();

        group.move();

        group.hold();
    }
}
