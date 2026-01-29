// Parent Class
class Shape {
    void draw() {
        System.out.println("Drawing a shape");
    }

    // Method Overloading (Compile-time Polymorphism)
    void area(int side) {
        System.out.println("Area of square: " + (side * side));
    }

    void area(int length, int width) {
        System.out.println("Area of rectangle: " + (length * width));
    }
}

// Child Class 1
class Circle extends Shape {
    @Override
    void draw() { // Method Overriding (Runtime Polymorphism)
        System.out.println("Drawing a circle");
    }

    void area(double radius) {
        System.out.println("Area of circle: " + (3.14 * radius * radius));
    }
}

// Child Class 2
class Triangle extends Shape {
    @Override
    void draw() { // Method Overriding
        System.out.println("Drawing a triangle");
    }

    void area(double base, double height) {
        System.out.println("Area of triangle: " + (0.5 * base * height));
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        // Runtime Polymorphism (Overriding)
        Shape s;
        s = new Circle();
        s.draw(); // Calls Circle's draw()

        s = new Triangle();
        s.draw(); // Calls Triangle's draw()

        // Compile-time Polymorphism (Overloading)
        Shape shape = new Shape();
        shape.area(5); // Square
        shape.area(4, 6); // Rectangle

        Circle c = new Circle();
        c.area(3.5); // Circle area (double radius)

        Triangle t = new Triangle();
        t.area(4.0, 7.0); // Triangle area
    }
}
