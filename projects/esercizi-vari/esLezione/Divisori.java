package esLezione;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/*Leggere un array di 5 numeri naturali, calcolare il massimo divisore primo di ogni numero memorizzato nell’array;
memorizza questi divisori primi in un altro array, infine stampa il più grande divisore primo tra quelli memorizzati nel secondo array.*/
public class Divisori {
    public static void main(String[] args) {
        int[] myArray = riempitore();
    }

    //riempimento array numeri naturali
    public static int[] riempitore() {
        Random r = new Random();
        int[] arr = new int[5];
        for (int i = 0; i <arr.length; i++) {
            arr[i] = r.nextInt(2,100);
        }
        return arr;
    }




}
