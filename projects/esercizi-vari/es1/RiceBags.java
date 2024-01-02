/*Provided that you have a given number of small rice bags (1 kilo each) and big rice bags (5 kilos each),
write a method that returns true if it is possible to make a package with goal kilos of rice.*/

package es1;

public class RiceBags {
    public static Boolean packageRice(Integer big, Integer small, Integer goal) {
        if (big * 5 + small >= goal && goal % 5 <= small) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(packageRice(2,3,7));
        System.out.println(1%2);
    }
}
