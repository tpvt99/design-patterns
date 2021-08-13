public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;
    private int quantity;
    private static volatile ChocolateBoiler chocolateBoiler;

    private ChocolateBoiler() {
        empty = true;
        boiled = false;
        quantity = 0;
    }

    public static ChocolateBoiler getInstance() {
        if (chocolateBoiler == null) {
            synchronized (ChocolateBoiler.class) {
                if (chocolateBoiler == null)
                    chocolateBoiler = new ChocolateBoiler();
            }
        }
        System.out.println("B: " + chocolateBoiler);
        return chocolateBoiler;
    }

    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;
        }
        quantity += 10;
        System.out.println("Fill with new quantity: " + quantity);
    }

    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
        quantity -= 10;
        System.out.println("Drain quantity: " + quantity);
    }

    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
        System.out.println("Boiled quantity: " + quantity);
    }

    public boolean isEmpty() {
        return empty;
    }

    public boolean isBoiled() {
        return boiled;
    }
}
