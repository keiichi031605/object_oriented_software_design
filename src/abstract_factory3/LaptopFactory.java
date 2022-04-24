package abstract_factory3;

public interface LaptopFactory {

    Processor createProcessor();

    Storage createStorage();
}