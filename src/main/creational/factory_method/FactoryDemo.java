package main.creational.factory_method;

/**
 * Define an interface for creating an object,
 * but let subclasses decide which class to instantiate.
 * Factory Method lets a class defer instantiation to subclasses.
 */
public class FactoryDemo {

    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();
    }
}
