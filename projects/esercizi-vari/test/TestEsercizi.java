package test;

import java.util.Arrays;
import java.util.Random;

/*Leggere un array di interi di 10 posizioni, leggere un ulteriore numero intero
e dire quanti numeri memorizzati nell’array sono inferiori e quanti superiori dell’ultimo numero letto.*/
//Leggere un array di interi di 10 posizioni e dire se in tutte le posizioni pari dell’array è memorizzato un numero pari.

public class TestEsercizi {
    public static void main(String[] args) {
        int[] myNumbers = new int[10];
        riempimento(myNumbers);
        System.out.println(Arrays.toString(myNumbers));
        maggioreMinore(myNumbers,10);
        int[] arrPari = {2,3,3,2,2,2,2};
        System.out.println(pariPari(arrPari));
    }

    //riempimento array di lunghezza n
    public static int[] riempimento(int[] arr) {
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(40);
        }
        return arr;
    }

    public static void maggioreMinore(int[] arr, int numConfronto) {
        int counterMinori = 0;
        int counterMaggiori = 0;
        int counterUguali = 0;
        for (int num : arr) {
            if (num < numConfronto) {
                counterMinori++;
            } else if (num > numConfronto) {
                counterMaggiori++;
            } else {
                counterUguali++;
            }
        }
        System.out.println(counterMinori + " numeri minori di " + numConfronto);
        System.out.println(counterMaggiori + " numeri maggiori di " + numConfronto);
        System.out.println(counterUguali + " numeri uguali a " + numConfronto);
    }

    public static boolean pariPari(int[] arr) {
        boolean pari = true;
        for (int i = 0; i < arr.length; i+=2) {
            if (arr[i] % 2 != 0) {
                pari = false;
            }
        }
        return pari;
    }
}
