public class SimpleDiscount {
    public static void main(String[] args) {
        System.out.println("Customer! The final total is : $" + calculateDiscount(100));
    }

    private static double calculateDiscount(double purchasePrice) {
        double discountPrice = (purchasePrice <= 100.0) ? purchasePrice : purchasePrice * 0.90;
        return discountPrice;
    }
}
