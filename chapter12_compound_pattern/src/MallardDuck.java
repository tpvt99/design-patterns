public class MallardDuck implements Quackable{

    Observable observable;

    public MallardDuck() {
        observable = new Observable(this);
    }

    @Override
    public String toString() {
        return "MallardDuck";
    }

    public void quack() {
        System.out.println("Quack");
        notifyObservers();
    }

    public void registerObserver(Observer observer) {
        observable.registerObserver(observer);
    }
    public void notifyObservers() {
        observable.notifyObservers();
    }
}
