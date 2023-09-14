package technology;

public class SmartPhone extends Computer {

    //FIELDS
    private String operatingSystem;

    //CONSTRUCTOR
    public SmartPhone(String brand, double price, String cpu, String operatingSystem) {
        super(brand, price, cpu);
        this.operatingSystem = operatingSystem; //additional property
    }
    //METHOD
    public String getOperatingSystem() { return this.operatingSystem;}
}
