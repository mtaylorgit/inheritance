package technology;

public class Laptop extends Computer{

    // FIELDS
    private Double screenSize;

    //CONSTRUCTOR
    public Laptop(String brand, Double price, String cpu, Double screenSize) {
        super(brand, price, cpu);//uses the Computer constructor for parts it can
        this.screenSize = screenSize;//additional property
    }
    //METHOD

    public Double getScreenSize() {
        return this.screenSize;
    }


}
