/*Scrivere un programma che contenga un metodo che permette di inizializzare una matrice
e di scambiare le sue righe e le sue colonne stampandola a video. Matrice di partenza:
{ {1,2,3}, {4,5,6} }
Matrice risultato:
1 4
2 5
3 6   */

public class Array5 {
    public static void matrixPrint(int[][] myMatrix) {
        int index = 0;
        for (int m1 : myMatrix[0]) {
            System.out.println(m1+" "+ myMatrix[1][index]);
            index++;
        }
    }

    public static void main(String[] args) {
        int[][] testMatrix = { {1,2,3}, {4,5,6} };
        matrixPrint(testMatrix);
    }
}
