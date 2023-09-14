package technology;

public class Computer {

    //FIELDS
    private String brand;
    private Double price;
    private String cpu;//Intel something, or AMD whatever

    //CONSTRUCTOR
    public Computer(String brand, double price, String cpu) {
        this.brand = brand;
        this.price = price;
        this.cpu = cpu;
    }
    //GETTERS & SETTERS
    public String getBrand() {
        return this.brand;
    }
    public Double getPrice() {
        return this.price;
    }
    public String getCpu() {
        return this.cpu;
    }

    //METHODS

    public String createHeadline() {
        //Returns a headline for catalog
        return this.brand + " " + this.cpu + "  " + this.price;
    }

    public Double dealerPrice(double dealerDiscountPercentage) {
        //Returns price calculated based on discount percentage passed
        return ((1-(dealerDiscountPercentage/100))*this.price);
    }

}