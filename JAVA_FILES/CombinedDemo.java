import java.io.*;

public class CombinedDemo {
    static void riskyMethod() throws IOException {
        throw new IOException("Simulated I/O error.");
    }

    public static void main(String[] args) {
        try {
            riskyMethod(); // Must be in try because riskyMethod declares throws
        }
        catch (IOException e) {
            System.out.println("Caught in main: " + e.getMessage());
        }
        finally {
            System.out.println("Cleanup actions executed here.");
        }
    }
}
