package com.runer;

import java.io.*;
import java.util.*;
import java.util.logging.*;
import java.util.stream.Collectors;

import com.user.User;
import com.anno.CustAnno;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        // Step 1: Create a list of User objects
        List<User> userList = new ArrayList<>();
        userList.add(new User("John", 25));
        userList.add(new User("Jane", 30));
        userList.add(new User("Adam", 35));
        userList.add(new User("Eve", 40));


        // Step 2: Log the list of users NoSkell
//        logger.log(Level.INFO, "List of users: {0}", userList);

        // COMPARE
        // Step 2: Use a stream to filter users based on age ) OG
        List<User> filteredUsers = userList.stream()
                .filter(user -> user.getAge() > 30)
                .collect(Collectors.toList());

//        List<User> filteredUsers = userList.stream()
//                .filter(user -> user.getAge() >= 30)
//                        .collect(Collectors.toList());
//                .toList();



        // Step 3: Print the filtered users
        filteredUsers.forEach(System.out::println);

//        // Step 4: Log the filtered list of users Noskell
//        logger.log(Level.INFO, "Filtered users: {0}", filteredUsers);


        // Step 4: Use a Map to store additional information about users
        Map<String, String> userInfoMap = new HashMap<>();
        userInfoMap.put("John", "Software Engineer");
        userInfoMap.put("Jane", "Project Manager");
        userInfoMap.put("Adam", "Data Analyst");
        userInfoMap.put("Eve", "Marketing Specialist");


//        // Step 5: Create a map of users using their names as keys
//        Map<String, User> userMap = userList.stream()
//                .collect(Collectors.toMap(User::getName, user -> user));
//
//        // Step 6: Log the user map
//        logger.log(Level.INFO, "User map: {0}", userMap);


        // Step 5: Retrieve information for a specific user
        String johnInfo = userInfoMap.get("John");
        System.out.println("John's info: " + johnInfo);

        // Step 6: Log a message using Java log system
        logger.log(Level.INFO, "Logging an informational message");


//        // Step 7: Perform a time-consuming operation using multi-threading
//        ExecutorService executor = Executors.newFixedThreadPool(2);
//        List<Future<String>> futures = new ArrayList<>();
//
//        for (nonskel.User user : userList) {
//            Future<String> future = executor.submit(() -> {
//                // Simulate a time-consuming operation
//                Thread.sleep(2000);
//                return "Processed " + user.getName();
//            });
//
//            futures.add(future);
//        }


        // Step 7: Perform a time-consuming operation in a separate thread
        new Thread(() -> {
            try {
                Thread.sleep(5000);
                logger.log(Level.INFO, "Time-consuming operation completed");
            } catch (InterruptedException e) {
                logger.log(Level.SEVERE, "Thread interrupted", e);
            }
        }).start();

//        // Step 8: Log the results of the time-consuming operation
//        for (Future<String> future : futures) {
//            try {
//                String result = future.get();
//                logger.log(Level.INFO, "Result: {0}", result);
//            } catch (InterruptedException | ExecutionException e) {
//                logger.log(Level.SEVERE, "An error occurred: {0}", e.getMessage());
//            }
//        }




//        // Step 9: Serialize the user list to a file
//        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("users.ser"))) {
//            oos.writeObject(userList);
//            logger.log(Level.INFO, "User list serialized successfully");
//        } catch (IOException e) {
//            logger.log(Level.SEVERE, "An error occurred during serialization: {0}", e.getMessage());
//        }


        // Step 9: Serialize and deserialize the userList
        try {
            // Serialization
            FileOutputStream fileOut = new FileOutputStream("userList.ser");
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(userList);
            objectOut.close();
            fileOut.close();

            // Deserialization
            FileInputStream fileIn = new FileInputStream("userList.ser");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            List<User> deserializedList = (List<User>) objectIn.readObject();
            objectIn.close();
            fileIn.close();

            // Print the deserialized list
            System.out.println("Deserialized List:");
            deserializedList.forEach(System.out::println);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "An error occurred during serialization/deserialization", e);
        }

//        // Step 10: Deserialize the user list from the file
//        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("users.ser"))) {
//            List<User> deserializedList = (List<User>) ois.readObject();
//            logger.log(Level.INFO, "Deserialized user list: {0}", deserializedList);
//        } catch (IOException | ClassNotFoundException e) {
//            logger.log(Level.SEVERE, "An error occurred during deserialization: {0}", e.getMessage());
//        }


//        // Step 11: Add an annotation to the main method
//        Main.class.getMethods()[0].getAnnotation(SuppressWarnings.class);

    }

    // Step 8: Add a custom annotation to a method
    @CustAnno
    public static void performCustomAnnotation() {
        // Custom annotation implementation
    }


    }