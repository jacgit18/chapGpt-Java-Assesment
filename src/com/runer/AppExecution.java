package com.runer;

import java.util.Map;

public class AppExecution {
    public static void main(String[] args) {


        // Controlling App Execution

        // Getting the current time in milliseconds
        long currentTime = System.currentTimeMillis();
        System.out.println("Current Time (milliseconds): " + currentTime);

        // Pausing the execution for 3 seconds
        try {
            System.out.println("Pausing the execution for 3 seconds...");
            Thread.sleep(3000);
            System.out.println("Resuming the execution...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Terminating the application
        System.out.println("Terminating the application...");
        System.exit(0);

        // Environment Execution

        // Getting the value of a specific environment variable
        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("JAVA_HOME: " + javaHome);

        // Getting all environment variables
        Map<String, String> envVariables = System.getenv();
        System.out.println("Environment Variables:");
        for (Map.Entry<String, String> entry : envVariables.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Getting the value of a system property
        String javaVersion = System.getProperty("java.version");
        System.out.println("Java Version: " + javaVersion);

        // Setting a system property
        System.setProperty("custom.property", "custom value");
        String customProperty = System.getProperty("custom.property");
        System.out.println("Custom Property: " + customProperty);
    }
}
