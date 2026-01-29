class NegativeMarksException extends RuntimeException {
    public NegativeMarksException(String msg) {
        super(msg);
    }
}

public class MarksDemo {
    public static void main(String[] args) {
        try {
            int marks = -10; // Input value

            System.out.println("Validating marks...");

            if(marks < 0) {
                // If marks are negative, we "throw" the exception
                throw new NegativeMarksException("Error: Marks cannot be negative (" + marks + ").");
            }

            // This line only runs if NO exception is thrown
            System.out.println("Marks successfully recorded: " + marks);

        } catch (NegativeMarksException e) {
            // This "catches" the exception and handles it gracefully
            System.out.println(e.getMessage());
        }

        // The program continues here instead of crashing
        System.out.println("Program execution finished safely.");
    }
}
