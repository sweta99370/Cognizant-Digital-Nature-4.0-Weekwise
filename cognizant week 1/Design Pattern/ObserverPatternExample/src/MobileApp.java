public class MobileApp implements Observer {
    private String appName;

    public MobileApp(String name) {
        this.appName = name;
    }

    @Override
    public void update(String stockName, double stockPrice) {
        System.out.println(appName + " received update: " + stockName + " is now $" + stockPrice);
    }
}
