package designpattern3;
//Crea una classe User che abbia i parametri privati nome ed età e i getter e setter
//All'interno di User ci sarà anche una funzione che stampi a video le informazioni di età e il nome.
//Creare 2 oggetti User di cui creerà un'istanza.
//Del primo si stamperanno le informazioni di default, del secondo si cambieranno le informazioni e poi si stamperanno a video

public class Main {
    public static void main(String[] args) {
        //creo 2 oggetti User
        User user1 = User.getUser();
        User user2 = User.getUser();

        //stampo le info default del primo
        System.out.println("Informazioni default: ");
        user1.stampaInfo();

        System.out.println("------------------------------");
        //cambio le info del secondo e stampo
        System.out.println("Informazioni dopo il loro cambio: ");
        user2.setNome("Tino");
        user2.setEta(24);
        user2.stampaInfo();
    }
}

