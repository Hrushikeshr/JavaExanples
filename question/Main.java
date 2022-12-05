package question;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Square square = new Square();
        Triangle triangle = new Triangle();
        Circle circle = new Circle();

        shape.area();
        shape.perimeter();

        square.area(5);
        square.perimeter(2);

        triangle.area(3, 5);
        triangle.perimeter(4,4,4);

        circle.area(9);
        circle.perimeter(5);

    }
}
