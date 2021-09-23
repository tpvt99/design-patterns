package hook;

public class TestingHook {
    public static void main(String[] args) {
        CoffeeWithHook coffee = new CoffeeWithHook();
        coffee.prepareRecipe();

        TeaWithHook tea = new TeaWithHook();
        tea.prepareRecipe();

    }
}
