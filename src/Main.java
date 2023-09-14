import technology.Computer;
import technology.Laptop;
import technology.SmartPhone;

public class Main {
    public static void main(String[] args) {
        Computer desktopMain = new Computer("Dell", 250, "AMD 3.0");
        System.out.println(desktopMain.getBrand());
        System.out.println(desktopMain.createHeadline());
        System.out.println(desktopMain.dealerPrice(15));

        //make a laptop
        Laptop officeLaptop = new Laptop("Lenovo", 349.00, "Intel i5", 15.00);
        System.out.println(officeLaptop.getScreenSize());
        System.out.println(officeLaptop.getBrand());

        //make a smartphone
        SmartPhone  workPhone = new SmartPhone("Motorola", 199.00, "Arm", "Android");
        System.out.println(workPhone.getBrand());
        System.out.println(workPhone.getOperatingSystem());
    }
}