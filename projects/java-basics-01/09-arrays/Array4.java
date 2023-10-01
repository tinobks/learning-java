/*Scrivere un programma che contenga un metodo che permette di inizializzare una matrice
riempita con dei valori a vostro piacimento e restituisca la somma degli elementi sulla prima riga*/

public class Array4 {
    public static int matrixSum(int[][] myMatrix) {
        int sum = 0;
        for (int i = 0; i < myMatrix.length; i++) {
            for (int j = 0; j < myMatrix[i].length; j++) {
                sum += myMatrix[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] testMatrix = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println(matrixSum(testMatrix));
    }
}
