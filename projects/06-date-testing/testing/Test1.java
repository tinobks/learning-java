package testing;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("hewo");
    }

    public Integer sum(Integer a, Integer b) {
        if (a == null || b == null) {
            return null;
        }
        return a + b;
    }

    public Integer multiply(Integer a, Integer b) {
        if (a == null || b == null) {
            return null;
        }
        return a * b;
    }
}
