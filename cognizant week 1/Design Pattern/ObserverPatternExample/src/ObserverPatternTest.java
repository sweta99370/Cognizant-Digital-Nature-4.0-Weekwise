public class ObserverPatternTest {
    public static void main(String[] args) {
        StockMarket market = new StockMarket();

        Observer mobileApp = new MobileApp("StockMobile");
        Observer webApp = new WebApp("StockWeb");

        market.registerObserver(mobileApp);
        market.registerObserver(webApp);

        market.setStockPrice("TCS", 3650.75);
        market.setStockPrice("Infosys", 1499.50);

        market.removeObserver(mobileApp);
        market.setStockPrice("Wipro", 420.10);
    }
}
