package final_practice.prog7.demo;

import java.util.Optional;

public class Main2 {
    public static void main(String[] args) {
        String value = "Hello";

        // This will print "Creating default string..." even though value is non-null
        String resultWithOrElse = Optional.ofNullable(value)
                .orElse(createDefaultString());

        // This will not print anything because the Optional is not empty
        String resultWithOrElseGet = Optional.ofNullable(value)
                .orElseGet(() -> createDefaultString());

        System.out.println(resultWithOrElse);     // Outputs "Hello"
        System.out.println(resultWithOrElseGet);  // Outputs "Hello"
    }

    private static String createDefaultString() {
        System.out.println("Creating default string...");
        return "Default";
    }

    private static Double div(Double a, Double b) {
        if (b == 0) return null;
        return a / b;
    }
}
