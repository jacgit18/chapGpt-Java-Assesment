package com.runer;

public class OuterClass {
    private int outerField;

    public void outerMethod() {
        System.out.println("Outer method");
    }

    // Static nested class
    public static class StaticNestedClass {
        public void nestedMethod() {
            System.out.println("Static nested method");
        }
    }

    // Inner class
    public class InnerClass {
        public void innerMethod() {
            System.out.println("Inner method");
            System.out.println("Accessing outer field: " + outerField);
            outerMethod();
        }
    }

    public void createNestedClasses() {
        // Creating an instance of the static nested class
        StaticNestedClass staticNestedObj = new StaticNestedClass();
        staticNestedObj.nestedMethod();

        // Creating an instance of the inner class
        InnerClass innerObj = new InnerClass();
        innerObj.innerMethod();
    }

    public static void main(String[] args) {
        OuterClass outerObj = new OuterClass();
        outerObj.createNestedClasses();
    }
}

