package ie.atu.lambda;

// Class that implements StringOperation and overrides the apply method
class ToUpperCase implements StringOperation {
    @Override
    public String apply(String input) {
        // Converts the input string to uppercase and returns it
        return input.toUpperCase();
    }
}
