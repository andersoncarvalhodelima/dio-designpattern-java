package com.example.designpatterns.singleton;

public class Singleton {
    private static Singleton instance;

    private Singleton() {
        // Private constructor to restrict instantiation
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}
