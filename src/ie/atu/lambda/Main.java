package ie.atu.lambda;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        // Part 1 Example:
        MathOperation addition = new Addition();
        System.out.println("Addition: " + addition.operate(5, 3));

        // Break
        System.out.println();

        // Part 1 DIY:
        // Use a lambda expression to implement the StringOperation interface
        StringOperation toUpperCase = input -> input.toUpperCase();

        // Test the apply method with a string of your choice
        String input1 = "my name is adam!";
        String result1 = toUpperCase.apply(input1);

        // Print the result
        System.out.println("Input: " + input1);
        System.out.println("Result: " + result1);

        // Break
        System.out.println();

        // Part 2 DIY:
        // Use a lambda expression to implement the StringOperation interface
        StringOperation toUpperCase2 = input -> input.toUpperCase();

        // Test the lambda with a string of your choice
        String input2 = "hello, adam!";
        String result2 = toUpperCase2.apply(input2);

        // Print the result
        System.out.println("Input: " + input2);
        System.out.println("Result: " + result2);

        // Break
        System.out.println();

        // Part 3 DIY:
        // Create a Runnable instance using a lambda expression
        Runnable task = () -> System.out.println("Hello from the thread");

        // Start a new thread with the Runnable
        Thread thread = new Thread(task);

        // Start the thread
        thread.start();

        // Optional: Print a message from the main thread
        System.out.println("Hello from the main thread");

        // Break
        System.out.println();

        // Part 4 DIY:
        // Create a Function instance to trim spaces
        Function<String, String> trimFunction = String::trim;

        // Create a lambda to convert the string to lowercase
        Function<String, String> toLowerCaseFunction = String::toLowerCase;

        // Combine the two functions
        Function<String, String> combinedFunction = trimFunction.andThen(toLowerCaseFunction);

        // Test the combined operation
        String input3 = "   Hi, it is Monday!   ";
        String result3 = combinedFunction.apply(input3);

        // Print the result
        System.out.println("Original: \"" + input3 + "\"");
        System.out.println("Processed: \"" + result3 + "\"");
    }
}

