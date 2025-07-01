public class StrategyPatternTest {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        PaymentStrategy creditCard = new CreditCardPayment("1234-5678-9876-5432");
        PaymentStrategy paypal = new PayPalPayment("user@example.com");

        System.out.println("=== Using Credit Card ===");
        context.setPaymentStrategy(creditCard);
        context.makePayment(1200.50);

        System.out.println("\n=== Using PayPal ===");
        context.setPaymentStrategy(paypal);
        context.makePayment(850.00);
    }
}