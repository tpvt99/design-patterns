public class RedheadDuck implements  Quackable{
    @Override
    public void quack() {
        System.out.println("Honk");
        notifyObservers();
    }

    Observable observable;

    public RedheadDuck() {
        observable = new Observable(this);
    }

    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }
    public void notifyObservers() {
        observable.notifyObservers();
    }

    @Override
    public String toString() {
        return "RedhatDuck";
    }
}
