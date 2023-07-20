public class Main {
    public static void main(String[] args) {
        SmartPhone[] smartPhones = new SmartPhone[5];
        smartPhones[0] = new SmartPhone(1, "Phone A", 500.0, "111-111-1111", 64, 4, 12);
        smartPhones[1] = new SmartPhone(2, "Phone B", 600.0, "222-222-2222", 128, 6, 16);
        smartPhones[2] = new SmartPhone(3, "Phone C", 700.0, "333-333-3333", 256, 8, 20);
        smartPhones[3] = new SmartPhone(4, "Phone D", 800.0, "444-444-4444", 128, 6, 16);
        smartPhones[4] = new SmartPhone(5, "Phone E", 900.0, "555-555-5555", 256, 8, 20);

        double totalPrice = PhoneApp.calculateTotalPrice(smartPhones);
        System.out.println("Toplam Fiyat: " + totalPrice);
    }
}
