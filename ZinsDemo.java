public class ZinsDemo {
    public static void main(String[] args) {
        //System.out.println("HelloWorld");

        //Ausgabe
        //System.out.println("Kontostand: " + int kontostand = 1000; + "; Zinsen: " + double zinsen= 2.25);
        System.out.println("Zinsen am Ende der Laufzeit = Kontostand: " + zinsrechnung(1000, 2.25));
        System.out.println("Zinsen am Ende der Laufzeit = Kontostand: " + zinsrechnung(3000, 4.75));
        System.out.println("Zinsen am Ende der Laufzeit = Kontostand: " + zinsrechnung(4759, 1.55));



    }

    public static double zinsrechnung (int kontostand, double zinsen) {
        double zinsenLaufzeitende = zinsen * kontostand / 100;
        return zinsenLaufzeitende;

    }
}
