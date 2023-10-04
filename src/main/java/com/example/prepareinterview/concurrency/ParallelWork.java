package com.example.prepareinterview.concurrency;

import java.util.concurrent.CompletableFuture;

public class ParallelWork {

    public void doInParallel() {
        CompletableFuture<Integer> f1 = CompletableFuture.supplyAsync(() -> 1);
        CompletableFuture<Integer> f2 = CompletableFuture.supplyAsync(() -> 2);
    }
}
