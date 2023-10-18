public class MainStudente {
    public static void main(String[] args) {
        //dichiaro oggetto di tipo studente
        Studente studenteNew = new Studente("Tino","Bokoshev","BKSTNR98T28Z256K");
        //cambio nome daa Tino a Tynarbek
        studenteNew.setNome("Tynarbek");

        System.out.println("Nome: " + studenteNew.getNome());
        System.out.println("Cognome: " + studenteNew.getCognome());
        System.out.println("ID: " + studenteNew.getIdentificativo());

    }
}
