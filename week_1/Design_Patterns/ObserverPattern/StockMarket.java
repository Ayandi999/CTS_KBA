package Design_Patterns.ObserverPattern;
import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock {
    private List<Observer> observers = new ArrayList<>();
    private double stockPrice;

    public void registerObserver(Observer o) {
        observers.add(o);
    }


    public void removeObserver(Observer o) {
        observers.remove(o);
    }


    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(stockPrice);
        }
    }

    public void setStockPrice(double newPrice) {
        this.stockPrice = newPrice;
        notifyObservers();
    }
}
