package creational.object_pool;

public class Main {
    public static void main(String[] args) {
        ResourcePoolFactory poolFactory = new ResourcePoolFactory(new RealResourceFactory());

        Resource r1 = poolFactory.get();
        Resource r2 = poolFactory.get();

        r1.print();
        r2.print();
        r1.close();
        r2.close();

        Resource r3 = poolFactory.get();

        r3.print();
    }
}
