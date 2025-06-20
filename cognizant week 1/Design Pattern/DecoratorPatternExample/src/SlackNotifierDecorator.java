public class SlackNotifierDecorator extends NotifierDecorator {
    public SlackNotifierDecorator(Notifier wrapped) {
        super(wrapped);
    }

    public void send(String message) {
        super.send(message);
        System.out.println("Sending Slack message: " + message);
    }
}
