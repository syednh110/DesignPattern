package StructuralDesignPatterns.BridgeDesignPattern;

public class Rectangle extends Shape{
    public Rectangle(Color color) {
        super(color);
    }

    @Override
    public String draw() {
        return "Rectangle Shape " + super.color.fillColor();
    }
}
