/*Scrivere un programma che contenga un metodo che permette di inizializzare una matrice
riempita con dei valori a vostro piacimento e restituisca la somma degli elementi sulla prima riga*/

public class Array4 {
    public static int matrixSum(int[][] myMatrix) {
        int sum = 0;
        for (int num : myMatrix[0]) {
            //aggiungo a sum gli elementi del PRIMO array (elementi prima riga della matrice)
            sum += num;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] testMatrix = { {1, 2, 3, 4}, {5, 6, 7, 10}, {8, 9, 1, 3} };
        //somma di 1+2+3+4 = 10
        System.out.println("Somma degli elementi della prima riga: " +matrixSum(testMatrix));
    }
}
