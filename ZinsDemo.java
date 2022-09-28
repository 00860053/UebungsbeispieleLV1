public class ZinsDemo {
    public static void main(String[] args) {
        //System.out.println("HelloWorld");

        //Initialisierung
        int kontostand = 1000;
        double zinsen = 2.25;


        //Ausgabe
        System.out.println("Kontostand: " + kontostand + "; Zinsen: " + zinsen);
        System.out.println("Zinsen am Ende der Laufzeit = " + zinsrechnung(kontostand, zinsen));

    }

    public static double zinsrechnung (int kontostand, double zinsen) {
        double zinsenLaufzeitende = zinsen * kontostand / 100;
        return zinsenLaufzeitende;

    }
}
