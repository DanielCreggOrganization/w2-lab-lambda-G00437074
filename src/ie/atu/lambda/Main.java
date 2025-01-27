package ie.atu.lambda;

public class Main {
    public static void main(String[] args) {
    // Part 1:
        // Example:
        MathOperation addition = new Addition();
        System.out.println("Addition: " + addition.operate(5, 3));

        // Create an instance of ToUpperCase
        StringOperation toUpperCase = new ToUpperCase();

        // Test the apply method with a string of your choice
        String input = "hello, world!";
        String result = toUpperCase.apply(input);

        // Print the result
        System.out.println("Input: " + input);
        System.out.println("Result: " + result);

    }
}
