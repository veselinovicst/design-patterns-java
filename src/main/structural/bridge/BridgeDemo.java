package main.structural.bridge;

/**
 * Decouple an abstraction from its implementation so that the two can vary independently.
 * Publish interface in an inheritance hierarchy, and bury implementation in its own inheritance hierarchy.
 */
public class BridgeDemo {
    
    public static void main(String[] args) {

        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
