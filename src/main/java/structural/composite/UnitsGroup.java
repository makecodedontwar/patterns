package structural.composite;

import java.util.ArrayList;
import java.util.List;

public class UnitsGroup implements Unit {
    private final List<Unit> units = new ArrayList<>();

    public void addUnit(Unit unit) {
        units.add(unit);
    }

    public void delUnit(Unit unit) {
        units.remove(unit);
    }

    @Override
    public void move() {
        units.forEach(Unit::move);
    }

    @Override
    public void attack() {
        units.forEach(Unit::attack);
    }

    @Override
    public void hold() {
        units.forEach(Unit::hold);
    }
}
