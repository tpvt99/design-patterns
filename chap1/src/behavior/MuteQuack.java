package behavior;

public class MuteQuack implements QuackBehavior{
    public void quack() {
        System.out.println("<< Silence >>");
    }
}