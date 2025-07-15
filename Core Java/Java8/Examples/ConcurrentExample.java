package com.cts.SpringAopDemo;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ConcurrentExample {
    public static void main(String[] args) {
        // Create a thread pool with 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Create a list to hold Future results
        List<Future<String>> futures = new ArrayList<>();

        // Submit 5 tasks
        for (int i = 1; i <= 5; i++) {
            final int taskId = i;
            Callable<String> task = () -> {
                System.out.println("Task " + taskId + " is running on " + Thread.currentThread().getName());
                Thread.sleep(1000); // Simulate work
                return "Result of Task " + taskId;
            };

            Future<String> future = executor.submit(task);
            futures.add(future);
        }

        // Retrieve the results
        for (Future<String> future : futures) {
            try {
                String result = future.get();
                System.out.println("Got: " + result);
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        }

        // Shutdown the executor
        executor.shutdown();
    }
}
