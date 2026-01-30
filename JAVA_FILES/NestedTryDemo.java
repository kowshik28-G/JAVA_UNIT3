public class NestedTryDemo {
    public static void main(String[] args) {
        try {
            System.out.println("Outer try block begins.");
            int a = 10 / 2; // OK

            try {
                int[] arr = new int[3];
                System.out.println(arr[5]); // Inner exception
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Inner catch: Invalid array index.");
            }

            System.out.println("Continuing outer try block...");
            int x = Integer.parseInt("abc"); // Outer exception
        }
        catch (NumberFormatException e) {
            System.out.println("Outer catch: Cannot convert to number.");
        }
        System.out.println("Program continues normally.");
    }
}
