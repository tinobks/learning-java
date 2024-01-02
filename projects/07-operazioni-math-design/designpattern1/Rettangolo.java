package designpattern1;

public class Rettangolo implements Shape {
    @Override
    public void draw() {
        System.out.println(" __________________");
        System.out.println("|                  |");
        System.out.println("|                  |");
        System.out.println(" ------------------");
    }
}
