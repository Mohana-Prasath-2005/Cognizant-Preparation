import java.util.concurrent.*;
import java.util.*;

public class ExecutorExample {
    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newFixedThreadPool(5);
        List<Future<String>> futures = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int id = i;
            futures.add(service.submit(() -> "Task " + id + " done"));
        }
        for (Future<String> f : futures) {
            System.out.println(f.get());
        }
        service.shutdown();
    }
}
