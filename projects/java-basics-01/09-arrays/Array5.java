/*Scrivere un programma che contenga un metodo che permette di inizializzare una matrice
e di scambiare le sue righe e le sue colonne stampandola a video. Matrice di partenza:
{ {1,2,3}, {4,5,6} }
Matrice risultato:
1 4
2 5
3 6   */

import java.util.ArrayList;

public class Array5 {

    //metodo per stampare la matrice
    static void matrixPrint(int[][] myMatrix) {
        for (int[] array : myMatrix) {
            //converto ogni array di interi in un array di stringhe
            String[] stringArray = new String[array.length];
            for (int i = 0; i < array.length; i++) {
                stringArray[i] = String.valueOf(array[i]);
            }
            //uso il metodo .join per stampare l'array senza parentesi e virgole
            System.out.println(String.join(" ", stringArray));
        }
    }

    //metodo per scambiare righe e colonne della matrice
    static int[][] swapMatrix(int[][] myMatrix) {
        //creo un array con le caratteristiche dell'array da swappare
        int[][] swappedArray = new int[myMatrix[0].length][myMatrix.length];
        for (int i = 0; i < myMatrix.length; i++) {
            for (int j = 0; j < myMatrix[i].length; j++) {
                //le righe dell array dato diventano colonne e viceversa
                swappedArray[j][i] = myMatrix[i][j];
            }
        }
        return swappedArray;
    }

    //metodo per vedere se le righe hanno lo stesso numero di elementi
    static boolean sameLength(int[][] myMatrix) {
        boolean same = false;
        for (int[] matrix : myMatrix) {
            same = myMatrix[0].length == matrix.length;
            if (!same) {
                return same;
            }
        }
        return same;
    }

    public static void main(String[] args) {
        int[][] testMatrix = { {1,2,3,}, {4,5,6}, {7,8,9} };

        //se ogni array ha lo stesso numero di elementi vengono eseguiti i metodi successivi
        if (sameLength(testMatrix)) {
            //swappo righe e colonne della matrice
            int[][] swapped = swapMatrix(testMatrix);
            //stampo la matrice con righe e colonne swappate
            matrixPrint(swapped);
        } else {
            //se l'array NON ha lo stesso numero di elementi non eseguo nessun metodo e stampo l'errore.
            System.out.println("ERROR: the matrix has different dimensions for the rows.");
        }
    }
}
