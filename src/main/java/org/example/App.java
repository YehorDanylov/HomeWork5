package org.example;

/**
 * Entry point and utility methods for the application.
 */
@SuppressWarnings("HideUtilityClassConstructor")
public final class App {

    private App() {
        // private constructor to prevent instantiation
    }

    /**
     * Entry point of the application.
     *
     * @param args Command-line arguments (not used in this application).
     */
    public static void main(final String[] args) {
        System.out.println("Hello World!");
    }

    /**
     * Adds two integers.
     *
     * @param a First integer
     * @param b Second integer
     * @return Sum of a and b
     */
    public static int add(final int a, final int b) {
        return a + b;
    }
}
