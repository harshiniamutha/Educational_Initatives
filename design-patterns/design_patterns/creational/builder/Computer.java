public class Computer {
    private String cpu;
    private String ram;
    private String storage;
    private String graphicsCard;
    private String motherboard;
    
    public Computer(String cpu, String ram, String storage, String graphicsCard, String motherboard) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.graphicsCard = graphicsCard;
        this.motherboard = motherboard;
    }
    
    // Getters
    public String getCpu() { return cpu; }
    public String getRam() { return ram; }
    public String getStorage() { return storage; }
    public String getGraphicsCard() { return graphicsCard; }
    public String getMotherboard() { return motherboard; }
    
    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + cpu + '\'' +
                ", RAM='" + ram + '\'' +
                ", Storage='" + storage + '\'' +
                ", Graphics Card='" + graphicsCard + '\'' +
                ", Motherboard='" + motherboard + '\'' +
                '}';
    }
}
