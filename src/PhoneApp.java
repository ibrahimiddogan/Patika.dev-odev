public class PhoneApp {
    public static double calculateTotalPrice(SmartPhone[] smartPhoneArray) {
        double total = 0.0;
        for (SmartPhone phone : smartPhoneArray) {
            total += phone.price;
        }
        return total;
    }
}
