// Interface defining behavior
interface Payment {
    void makePayment(double amount) throws Exception;
}

// Class implementing the interface
class CreditCardPayment implements Payment {
    @Override
    public void makePayment(double amount) throws Exception {
        if (amount <= 0) {
            throw new Exception("Invalid amount. Must be greater than zero.");
        }
        System.out.println("Processing credit card payment of: " + amount);
    }
}

// Another implementation
class UpiPayment implements Payment {
    @Override
    public void makePayment(double amount) throws Exception {
        if (amount > 50000) {
            throw new Exception("UPI limit exceeded! Max allowed is 50,000.");
        }
        System.out.println("Processing UPI payment of: " + amount);
    }
}

public class InterfaceExceptionDemo {
    public static void main(String[] args) {
        Payment pay;
        try {
            pay = new CreditCardPayment();
            pay.makePayment(2000); // Valid payment

            pay = new UpiPayment();
            pay.makePayment(80000); // Throws exception
        } catch (Exception e) {
            System.out.println("Payment Failed: " + e.getMessage());
        }
        System.out.println("Program continues safely...");
    }
}
