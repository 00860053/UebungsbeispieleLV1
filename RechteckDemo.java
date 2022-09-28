public class RechteckDemo {
    public static void main(String[] args) {
        //System.out.println("HelloWorld");

        //Initialisierung, Deklarierung
        int breite = 5;
        int laenge = 7;

        //Operation
        int umfang = (breite * 2) + (laenge * 2);
        int flaeche = breite * laenge;

        //Ausgabe
        System.out.println("Umfang = 2x Länge + 2x Breite");
        System.out.println(umfang + " = 2x" + laenge + " + 2x" + breite);
        System.out.println("Fläche = Länge * Breite");
        System.out.println(flaeche + " = " + laenge + " * " + breite);


    }

}
