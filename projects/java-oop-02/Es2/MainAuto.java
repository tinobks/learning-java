public class MainAuto {
    public static void main(String[] args) {
        Auto autoNew = new Auto("Alfa Romeo","GT",1900,"AB123CD");

        System.out.println("Marca: " + autoNew.getMarca());
        System.out.println("Modello: " + autoNew.getModello());
        System.out.println("Cilindrata: " + autoNew.getCilindrata());
        System.out.println("Targa: " + autoNew.getTarga());

        //modifiche cilindrata
        autoNew.setCilindrata(2000);

        System.out.println("________________________________");
        System.out.println("Nuova cilindrata dell'Auto: " + autoNew.getCilindrata());
    }
}
