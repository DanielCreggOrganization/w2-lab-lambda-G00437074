package ie.atu.lambda;

@FunctionalInterface
public interface StringOperation {
    // (SAM) Signle Abstract method that takes a String parameter and returns a String
    String apply(String input);

}