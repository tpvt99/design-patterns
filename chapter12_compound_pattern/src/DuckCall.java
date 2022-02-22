public class DuckCall implements Quackable{
    @Override
    public void quack() {
        System.out.println("Kwak");
        notifyObservers();
    }

    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }
    public void notifyObservers() {
        observable.notifyObservers();
    }

    Observable observable;

    public DuckCall() {
        observable = new Observable(this);
    }

    @Override
    public String toString() {
        return "CallDuck";
    }
}
