// Custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {
    static void verifyAge(int age) throws InvalidAgeException {
        if(age < 18) {
            throw new InvalidAgeException("Age must be 18 or above.");
        }
        System.out.println("Age is valid.");
    }

    public static void main(String[] args) {
        try {
            verifyAge(15); // Will trigger custom exception
        }
        catch (InvalidAgeException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}
