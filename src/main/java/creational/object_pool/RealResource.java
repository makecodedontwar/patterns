package creational.object_pool;

import java.util.Objects;

public class RealResource implements Resource {
    private final long creationTime;

    public RealResource() {
        this.creationTime = System.nanoTime();
    }

    @Override
    public void print() {
        System.out.println("Created: " + creationTime);
    }

    @Override
    public void close() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RealResource that = (RealResource) o;
        return creationTime == that.creationTime;
    }

    @Override
    public int hashCode() {

        return Objects.hash(creationTime);
    }
}
