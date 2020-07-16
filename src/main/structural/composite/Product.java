package main.structural.composite;

public class Product extends Entity {

    private int value;
    public Product(int value) {
        this.value = value;
    }

    @Override
    public void traverse(int[] levels) {
        if (printThisLevel(levels)) {
            System.out.println(indent.toString() + value);
        }
    }
}
