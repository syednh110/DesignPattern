package structuraldesignpatterns.bridgedesignpattern;

public class Main {

    public static void main(String[] args) {
        Shape shape = new Rectangle(new BlueColor());
        System.out.println(shape.draw());

        Shape shape1 = new Circle(new RedColor());
        System.out.println(shape1.draw());
    }
}
