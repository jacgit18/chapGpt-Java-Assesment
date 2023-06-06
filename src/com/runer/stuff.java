//package com.runer;
//
//public class stuff {
//
//    import java.util.*;
//import java.util.concurrent.*;
//
//    // Task 1: Multi-threading and Concurrency
//    class MyThread extends Thread {
//        @Override
//        public void run() {
//            // Implement the logic for the thread's behavior
//        }
//    }
//
//    // Task 2: Collections and Generics
//    class DataProcessor<T> {
//        private List<T> data;
//
//        public DataProcessor() {
//            data = new ArrayList<>();
//        }
//
//        public void addData(T item) {
//            // Add the item to the data list
//        }
//
//        public T processData() {
//            // Process the data list and return the result
//            return null;
//        }
//    }
//
//    // Task 3: Annotations
//    class MyAnnotationProcessor {
//        public static void processAnnotations(Class<?> clazz) {
//            // Implement the logic to process annotations of the given class
//        }
//    }
//
//    // Task 4: Streams
//    class StreamProcessor {
//        public static void processStream(List<Integer> numbers) {
//            // Implement the logic to process the stream of numbers
//        }
//    }
//
//    public class AssessmentProject {
//        public static void main(String[] args) {
//            // Task 1: Multi-threading and Concurrency
//            MyThread thread = new MyThread();
//            thread.start();
//
//            // Task 2: Collections and Generics
//            DataProcessor<String> processor = new DataProcessor<>();
//            processor.addData("Data 1");
//            processor.addData("Data 2");
//            String result = processor.processData();
//            System.out.println("Processed result: " + result);
//
//            // Task 3: Annotations
//            MyAnnotationProcessor.processAnnotations(ExampleClass.class);
//
//            // Task 4: Streams
//            List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
//            StreamProcessor.processStream(numbers);
//        }
//    }
//
//    // Example class for Task 3: Annotations
//    @MyAnnotation
//    class ExampleClass {
//        // Class implementation
//    }
//
//
//}
