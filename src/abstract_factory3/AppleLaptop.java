package abstract_factory3;

public class AppleLaptop implements LaptopFactory {

    private int storageSize;

    public AppleLaptop(int storageSize) {
        this.storageSize = storageSize;
    }

    public Processor createProcessor() {
        return new AppleProcessor();
    }

    public Storage createStorage() {
        return new AppleStorage(storageSize);
    }

}