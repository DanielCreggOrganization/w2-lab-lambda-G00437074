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


     }
 }
