/*Scrivere un programma che contenga un metodo che permette di inizializzare una matrice
riempita con dei valori a vostro piacimento e restituisca la somma degli elementi sulla prima riga*/

public class Array4 {
    public static int matrixSum(int[][] myMatrix) {
        int sum = 0;
        for (int i = 0; i < myMatrix.length; i++) {
            //aggiungo a sum i primi elementi di ogni array
            sum += myMatrix[i][0];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] testMatrix = { {1, 2, 3, 4}, {5, 6, 7}, {8,9} };
        System.out.println(matrixSum(testMatrix));
    }
}
