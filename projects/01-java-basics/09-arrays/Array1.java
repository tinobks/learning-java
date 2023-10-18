/*Scrivi un programma che contenga un metodo che crea un array e lo riempie con i numeri da 1 a 10
e che che calcoli la somma dei numeri contenuti nell'array inizializzato e la stampi a video.*/

public class Array1 {
    public static void sumArray() {
        int[] Array1to10 = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;
        for (int i : Array1to10) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        sumArray();
    }
}
