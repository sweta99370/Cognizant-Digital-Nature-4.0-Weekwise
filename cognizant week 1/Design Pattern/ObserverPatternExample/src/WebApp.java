public class WebApp implements Observer {
    private String website;

    public WebApp(String site) {
        this.website = site;
    }

    @Override
    public void update(String stockName, double stockPrice) {
        System.out.println(website + " dashboard: " + stockName + " updated to $" + stockPrice);
    }
}
