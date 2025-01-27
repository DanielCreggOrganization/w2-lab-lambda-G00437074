package ie.atu.lambda;

public class Main {
    public static void main(String[] args) {
        // Part 1 Example:
        MathOperation addition = new Addition();
        System.out.println("Addition: " + addition.operate(5, 3));

        // Part 1 DIY:
        // Use a lambda expression to implement the StringOperation interface
        StringOperation toUpperCase = input -> input.toUpperCase();

        // Test the apply method with a string of your choice
        String input = "my name is adam!";
        String result = toUpperCase.apply(input);

        // Print the result
        System.out.println("Input: " + input);
        System.out.println("Result: " + result);

        // Part 2 DIY:
        // Use a lambda expression to implement the StringOperation interface
        StringOperation toUpperCase2 = input2 -> input2.toUpperCase();

        // Test the lambda with a string of your choice
        String input2 = "hello, adam!";
        String result2 = toUpperCase.apply(input2);

        // Print the result
        System.out.println("Input: " + input2);
        System.out.println("Result: " + result2);

    }
}
