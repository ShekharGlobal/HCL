package com.cts.SpringAopDemo;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureExample {
    public static void main(String[] args) {
        // 1. Supply a value asynchronously
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            System.out.println("Computing...");
            return 10;
        });

        // 2. Transform the value
        CompletableFuture<Integer> transformedFuture = future.thenApply(result -> {
            System.out.println("Transforming...");
            return result * 2;
        });

        // 3. Consume the value
        transformedFuture.thenAccept(finalResult -> {
            System.out.println("Final Result: " + finalResult);
        });

        // Wait for all stages to finish (just for demonstration)
        transformedFuture.join();
    }
}
