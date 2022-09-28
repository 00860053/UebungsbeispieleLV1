public class ZinsDemo {
    public static void main(String[] args) {
        //System.out.println("HelloWorld");

        //Initialisierung
        int kontostand = 1000;
        double zinsen = 2.25;

        //Operation
        double zinsenLaufzeitende = zinsen * kontostand / 100;

        //Ausgabe
        System.out.println("Zinsen am Ende der Laufzeit = " + zinsenLaufzeitende);

    }
}
