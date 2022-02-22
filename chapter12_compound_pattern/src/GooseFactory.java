public class GooseFactory extends AbstractGeeseFactory{
    @Override
    public QuackCounter createGooseDuck() {
        return new QuackCounter(new GooseAdapter(new Goose()));
    }
}
