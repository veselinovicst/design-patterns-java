package main.creational.singleton;

/**
 * Ensure a class has only one instance, and provide a global point of access to it.
 */
public class SingletonPattern {

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println("Singleton " + singleton);
    }
}
