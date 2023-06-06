package com.runer;

public class NonStatic {

        private static String staticField = "Static field";
        private String instanceField = "Instance field";

        public static void staticMethod() {
            System.out.println("Static method called");
            System.out.println(staticField);  // Accessing static field directly
            // System.out.println(instanceField);  // Cannot access instance field directly
        }

        public void instanceMethod() {
            System.out.println("Instance method called");
            System.out.println(staticField);  // Accessing static field directly
            System.out.println(instanceField);  // Accessing instance field directly
        }
    }



