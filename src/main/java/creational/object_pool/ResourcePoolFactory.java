package creational.object_pool;

import java.util.LinkedList;
import java.util.Queue;

public class ResourcePoolFactory implements ResourceFactory {
    private Queue<Resource> pool = new LinkedList<>();

    private final ResourceFactory resourceFactory;

    public ResourcePoolFactory(ResourceFactory resourceFactory) {
        this.resourceFactory = resourceFactory;
    }


    @Override
    public Resource get() {
        if (pool.isEmpty()) {
            return new PooledResource(resourceFactory.get());
        } else {
            return pool.poll();
        }
    }

    public class PooledResource implements Resource {
        private final Resource resource;

        PooledResource(Resource resource) {
            this.resource = resource;
        }

        @Override
        public void print() {
            resource.print();
        }

        @Override
        public void close() {
            pool.add(this);
        }
    }
}
