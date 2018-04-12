package structural.composite;

public class Soldier implements Unit {
    @Override
    public void move() {
        System.out.println("Soldier move!");
    }

    @Override
    public void attack() {
        System.out.println("Soldier attack!");
    }

    @Override
    public void hold() {
        System.out.println("Soldier hold!");
    }
}
