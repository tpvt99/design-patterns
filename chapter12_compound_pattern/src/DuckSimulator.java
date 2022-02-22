public class DuckSimulator {
    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        AbstractDuckFactory duckFactory = new CountingDuckFactory();
        AbstractGeeseFactory geeseFactory = new GooseFactory();
        simulator.simulate(duckFactory, geeseFactory);
    }

    void simulate(AbstractDuckFactory duckFactory, AbstractGeeseFactory geeseFactory) {
        Quackable mallardDuck = duckFactory.createMallardDuck();
        Quackable redheadDuck = duckFactory.createRedheadDuck();
        Quackable duckCall = duckFactory.createDuckCall();
        Quackable rubberDuck = duckFactory.createRubberDuck();
        Quackable gooseDuck = geeseFactory.createGooseDuck();

        System.out.println("\nDuck Simulator: With Composible Flocks");

        Flock flockOfDucks = new Flock();

        flockOfDucks.add(mallardDuck);
        flockOfDucks.add(redheadDuck);
        flockOfDucks.add(duckCall);
        flockOfDucks.add(rubberDuck);
        flockOfDucks.add(gooseDuck);

        Flock flockOfMallardsDucks = new Flock();

        Quackable mallardDuck1 = duckFactory.createMallardDuck();
        Quackable mallardDuck2 = duckFactory.createMallardDuck();
        Quackable mallardDuck3 = duckFactory.createMallardDuck();
        Quackable mallardDuck4 = duckFactory.createMallardDuck();

        flockOfMallardsDucks.add(mallardDuck1);
        flockOfMallardsDucks.add(mallardDuck2);
        flockOfMallardsDucks.add(mallardDuck3);
        flockOfMallardsDucks.add(mallardDuck4);

        //flockOfDucks.add(flockOfMallardsDucks);

        System.out.println("\nDuck Simulator: With Observer");
        Quacklogist quacklogist = new Quacklogist();
        flockOfDucks.registerObserver(quacklogist);

        simulate(flockOfDucks);

        System.out.println("The DUck quacks " + QuackCounter.getNumberOfQuacks());
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
