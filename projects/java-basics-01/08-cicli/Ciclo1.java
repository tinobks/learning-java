/*Scrivere un programma che contenga un metodo che sfrutti il while loop
e prenda in ingresso 1 valore intero come limite superiore
e calcoli la somma di tutti i valori prima del limite e la stampi a video.
(Esempio passo 5 come limite e otterrò la somma di 1 + 2 + 3 + 4)*/

public class Ciclo1 {
    public static int sumPrevious(int num) {
        int i = 0;
        int sum = 0;
        while (i < num) {
            sum += i;
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumPrevious(5));
    }
}
