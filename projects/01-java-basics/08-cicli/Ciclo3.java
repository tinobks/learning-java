/*Scrivi un programma che contenga un metodo che prende in ingresso un numero
e il massimo numero di risultati che vuoi avere e stampi tutti i numeri naturali
in ordine inverso (Quindi se passo il punto di partenza a 6 e gli dico di
restituirmi 3 risultati mi aspetto in uscita [6 5 4] stampati).*/

public class Ciclo3 {
    public static void reverse(int num, int results) {
        //il loop stampa i che inizialmente e' uguale al num per poi scendere di 1
        //grazie a  i > num - results, i viene stampato tante volte quanto viene dato a results
        for (int i = num; i > (num - results); i--) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        reverse(6,8);
    }
}
