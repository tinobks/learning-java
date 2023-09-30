/*Scrivi un programma che contenga un metodo che prende in ingresso un valore numerico
e restituisca la tabellina aritmetica di quel numero che dovrà essere stampata a video.*/

public class Ciclo2 {
    public static void tabellina(int num) {
        for (int i = 0; i <= 10; i++) {
            int result = num * i;
            System.out.println(num+"*"+i+" = "+result);
        }
    }

    public static void main(String[] args) {
        tabellina(9);
    }
}
