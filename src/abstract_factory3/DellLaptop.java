package abstract_factory3;

public class DellLaptop implements LaptopFactory {
    private int storageSize;
    public DellLaptop(int storageSize) {
        this.storageSize=storageSize;
    }
    
    public Processor createProcessor() {
        return new DellProcessor();
    }

    public Storage createStorage() {
        return new DellStorage(storageSize);
    }

}