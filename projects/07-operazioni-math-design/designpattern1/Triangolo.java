package designpattern1;

public class Triangolo implements Shape {
    @Override
    public void draw() {
        System.out.println("    /\\   ");
        System.out.println("   /  \\   ");
        System.out.println("  /    \\  ");
        System.out.println(" /      \\ ");
        System.out.println("/________\\");
    }
}
