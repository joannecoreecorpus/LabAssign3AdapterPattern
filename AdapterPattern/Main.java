public class Main {
    public static void main(String[] args) {

        Laptop laptop = new Laptop();
        Refrigerator refrigerator = new Refrigerator();
        SmartphoneCharger charger = new SmartphoneCharger();

        PowerOutlet laptopOutlet = new LaptopAdapter(laptop);
        PowerOutlet fridgeOutlet = new RefrigeratorAdapter(refrigerator);
        PowerOutlet phoneOutlet = new SmartphoneAdapter(charger);

        System.out.println("--- Activating Power Outlets ---");
        laptopOutlet.plugIn();
        fridgeOutlet.plugIn();
        phoneOutlet.plugIn();
    }
}
