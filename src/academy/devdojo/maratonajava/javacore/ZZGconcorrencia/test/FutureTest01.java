package academy.devdojo.maratonajava.javacore.ZZGconcorrencia.test;

import java.util.concurrent.*;

public class FutureTest01 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Double> dollarRequest = executorService.submit(() -> {
            TimeUnit.SECONDS.sleep(5);
            return 4.35D;
        });
        System.out.println(doSomething());
        Double dollarResponse = null;
        try {
            dollarResponse = dollarRequest.get(3, TimeUnit.SECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            e.printStackTrace();
        }finally {
            executorService.shutdown();
        }
        System.out.println("Dollar: "+dollarResponse);
    }

    private static long doSomething() {
        System.out.println(Thread.currentThread().getName());
        long sum = 0;
        for (int i = 0; i < 1_000_000; i++) {
            sum += i;
        }
        return sum;
    }
}
