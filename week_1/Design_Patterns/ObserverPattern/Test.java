package Design_Patterns.ObserverPattern;

public class Test {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer user1 = new MobileApp("Alice");
        Observer user2 = new WebApp("StockWatch");
        Observer user3 = new MobileApp("Bob");

        // Register observers
        stockMarket.registerObserver(user1);
        stockMarket.registerObserver(user2);
        stockMarket.registerObserver(user3);

        System.out.println("Setting stock price to 105.5");
        stockMarket.setStockPrice(105.5);

        System.out.println("\nBob unsubscribes.");
        stockMarket.removeObserver(user3);

        System.out.println("\nSetting stock price to 110.0");
        stockMarket.setStockPrice(110.0);
    }
}
