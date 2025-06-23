package Design_Patterns.ObserverPattern;

public class WebApp implements Observer {
    private String siteName;

    public WebApp(String siteName) {
        this.siteName = siteName;
    }

    public void update(double stockPrice) {
        System.out.println("WebApp (" + siteName + "): New stock price = " + stockPrice);
    }
}
