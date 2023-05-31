public class skel {


    public class JavaProject {
        private static final Logger logger = Logger.getLogger(JavaProject.class.getName());

        public static void main(String[] args) {
            // Step 1: Create a list of User objects
            List<User> userList = new ArrayList<>();
            userList.add(new User("John", 25));
            userList.add(new User("Jane", 30));
            userList.add(new User("Adam", 35));
            userList.add(new User("Eve", 40));

            // Step 2: Use a stream to filter users based on age
            List<User> filteredUsers = userList.stream()
                    .filter(user -> user.getAge() > 30)
                    .collect(Collectors.toList());

            // Step 3: Print the filtered users
            filteredUsers.forEach(System.out::println);

            // Step 4: Use a Map to store additional information about users
            Map<String, String> userInfoMap = new HashMap<>();
            userInfoMap.put("John", "Software Engineer");
            userInfoMap.put("Jane", "Project Manager");
            userInfoMap.put("Adam", "Data Analyst");
            userInfoMap.put("Eve", "Marketing Specialist");

            // Step 5: Retrieve information for a specific user
            String johnInfo = userInfoMap.get("John");
            System.out.println("John's info: " + johnInfo);

            // Step 6: Log a message using Java log system
            logger.log(Level.INFO, "Logging an informational message");

            // Step 7: Perform a time-consuming operation in a separate thread
            new Thread(() -> {
                try {
                    Thread.sleep(5000);
                    logger.log(Level.INFO, "Time-consuming operation completed");
                } catch (InterruptedException e) {
                    logger.log(Level.SEVERE, "Thread interrupted", e);
                }
            }).start();

            // Step 8: Add a custom annotation to a method
            performCustomAnnotation();

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
        }

        @CustomAnnotation
        public static void performCustomAnnotation() {
            // Custom annotation implementation
        }
    }

    // Custom Annotation
    @interface CustomAnnotation {
        // Annotation elements
    }

}
