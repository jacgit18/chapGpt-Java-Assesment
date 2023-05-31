public class nonskel {

        import java.io.*;
import java.util.*;
import java.util.logging.*;

    class User implements Serializable {
        private String name;
        private int age;

        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return "User [name=" + name + ", age=" + age + "]";
        }
    }

    public class JavaProject {
        private static final Logger logger = Logger.getLogger(JavaProject.class.getName());

        @SuppressWarnings("unchecked")
        public static void main(String[] args) {
            // Step 1: Create a list of users
            List<User> userList = new ArrayList<>();
            userList.add(new User("John", 25));
            userList.add(new User("Alice", 30));
            userList.add(new User("Bob", 35));
            userList.add(new User("Sarah", 28));
            userList.add(new User("Mike", 32));

            // Step 2: Log the list of users
            logger.log(Level.INFO, "List of users: {0}", userList);

            // Step 3: Filter users based on age using streams
            List<User> filteredUsers = userList.stream()
                    .filter(user -> user.getAge() >= 30)
                    .toList();

            // Step 4: Log the filtered list of users
            logger.log(Level.INFO, "Filtered users: {0}", filteredUsers);

            // Step 5: Create a map of users using their names as keys
            Map<String, User> userMap = userList.stream()
                    .collect(Collectors.toMap(User::getName, user -> user));

            // Step 6: Log the user map
            logger.log(Level.INFO, "User map: {0}", userMap);

            // Step 7: Perform a time-consuming operation using multi-threading
            ExecutorService executor = Executors.newFixedThreadPool(2);
            List<Future<String>> futures = new ArrayList<>();

            for (User user : userList) {
                Future<String> future = executor.submit(() -> {
                    // Simulate a time-consuming operation
                    Thread.sleep(2000);
                    return "Processed " + user.getName();
                });

                futures.add(future);
            }

            // Step 8: Log the results of the time-consuming operation
            for (Future<String> future : futures) {
                try {
                    String result = future.get();
                    logger.log(Level.INFO, "Result: {0}", result);
                } catch (InterruptedException | ExecutionException e) {
                    logger.log(Level.SEVERE, "An error occurred: {0}", e.getMessage());
                }
            }

            // Step 9: Serialize the user list to a file
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("users.ser"))) {
                oos.writeObject(userList);
                logger.log(Level.INFO, "User list serialized successfully");
            } catch (IOException e) {
                logger.log(Level.SEVERE, "An error occurred during serialization: {0}", e.getMessage());
            }

            // Step 10: Deserialize the user list from the file
            try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("users.ser"))) {
                List<User> deserializedList = (List<User>) ois.readObject();
                logger.log(Level.INFO, "Deserialized user list: {0}", deserializedList);
            } catch (IOException | ClassNotFoundException e) {
                logger.log(Level.SEVERE, "An error occurred during deserialization: {0}", e.getMessage());
            }

            // Step 11: Add an annotation to the main method
            JavaProject.class.getMethods()[0].getAnnotation(SuppressWarnings.class);
        }
    }

}
