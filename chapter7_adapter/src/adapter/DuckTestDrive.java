package adapter;

import adapter.duck.Duck;
import adapter.duck.DuckAdapter;
import adapter.duck.MallardDuck;
import adapter.turkey.Turkey;
import adapter.turkey.TurkeyAdapter;
import adapter.turkey.WildTurkey;

public class DuckTestDrive {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey duckAdapter = new DuckAdapter(duck);

        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("The adapter.turkey says...");
        testTurkey(turkey);

        System.out.println("\nThe DuckAdapter says...");
        testTurkey(duckAdapter);

        System.out.println("\nThe adapter.duck says...");
        testDuck(duck);

        System.out.println("\nThe TurkeyAdapter says...");
        testDuck(turkeyAdapter);

    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }

    static void testTurkey(Turkey turkey) {
        turkey.gobble();
        turkey.fly();
    }
}
