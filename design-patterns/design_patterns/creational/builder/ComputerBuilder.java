public class ComputerBuilder {
    private String cpu;
    private String ram;
    private String storage;
    private String graphicsCard;
    private String motherboard;
    
    // Setter methods that return the builder for method chaining
    public ComputerBuilder setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }
    
    public ComputerBuilder setRam(String ram) {
        this.ram = ram;
        return this;
    }
    
    public ComputerBuilder setStorage(String storage) {
        this.storage = storage;
        return this;
    }
    
    public ComputerBuilder setGraphicsCard(String graphicsCard) {
        this.graphicsCard = graphicsCard;
        return this;
    }
    
    public ComputerBuilder setMotherboard(String motherboard) {
        this.motherboard = motherboard;
        return this;
    }
    
    // Build method that creates and returns the final Computer object
    public Computer build() {
        // Set default values if not specified
        if (cpu == null) cpu = "Default CPU";
        if (ram == null) ram = "8GB";
        if (storage == null) storage = "256GB SSD";
        if (graphicsCard == null) graphicsCard = "Integrated Graphics";
        if (motherboard == null) motherboard = "Standard Motherboard";
        
        return new Computer(cpu, ram, storage, graphicsCard, motherboard);
    }
}
