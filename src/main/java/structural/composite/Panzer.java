package structural.composite;

public class Panzer implements Unit {
    @Override
    public void move() {
        System.out.println("Panzer move!");
    }

    @Override
    public void attack() {
        System.out.println("Panzer attack!");
    }

    @Override
    public void hold() {
        System.out.println("Panzer hold!");
    }
}
