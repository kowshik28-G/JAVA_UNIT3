public class MultipleCatchDemo {
    public static void main(String[] args) {
        try {
            int[] arr = {10, 20, 30};
            int a = 10 / 0; // ArithmeticException
            int x = arr[5]; // ArrayIndexOutOfBoundsException
            System.out.println(x);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is invalid!");
        } catch (Exception e) {
            System.out.println("General exception occurred: " + e.getMessage());
        }
    }
}
