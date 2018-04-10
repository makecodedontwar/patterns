package behavioral.mediator;

public interface Aircraft {
    void setControl(AirportControl control);

    void moveTo(int sector);

    void addDangerousSector(int sector);

    void removeDangerousSector(int sector);

    int getSector();
}