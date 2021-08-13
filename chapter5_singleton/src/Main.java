import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ForkJoinPool fjpInitial = new ForkJoinPool(3);
        List<Integer> a = fjpInitial.submit(() -> IntStream.rangeClosed(1, 3).parallel().mapToObj(r -> {
            callThread(r);
            return 1;
        }).collect(Collectors.toList())).get();
    }

    public static void callThread(int r) {
        ChocolateBoiler boiler = ChocolateBoiler.getInstance();
        boiler.fill();
        boiler.boil();
        boiler.drain();
    }
}
