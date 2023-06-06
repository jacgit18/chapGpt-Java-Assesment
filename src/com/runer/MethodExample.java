package com.runer;

public class MethodExample {
    public static void main(String[] args) {
        // Accessing a static method
        NonStatic.staticMethod();

        // Accessing an instance method
        NonStatic obj = new NonStatic();
        obj.instanceMethod();
    }
}
