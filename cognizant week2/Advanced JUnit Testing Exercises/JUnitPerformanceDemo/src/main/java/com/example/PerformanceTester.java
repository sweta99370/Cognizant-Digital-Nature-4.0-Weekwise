package com.example;

public class PerformanceTester {

    public void performTask() {
        // Simulate a task that takes ~300ms
        try {
            Thread.sleep(300); 
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}