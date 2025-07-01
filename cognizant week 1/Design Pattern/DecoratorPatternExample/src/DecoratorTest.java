public class DecoratorTest {
    public static void main(String[] args) {
        Notifier notifier = new EmailNotifier();

        // Add SMS functionality
        notifier = new SMSNotifierDecorator(notifier);

        // Add Slack functionality
        notifier = new SlackNotifierDecorator(notifier);

        notifier.send("System update at 9 PM.");
    }
}
