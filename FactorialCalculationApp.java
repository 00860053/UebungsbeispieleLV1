import java.util.Scanner;

public class FactorialCalculationApp {
    /*
    Fakultät:
    5! = 5 * 4 * 3 * 2 * 1
     */
    public static void main(String[] args) {
        //System.out.println("Hello World");
        System.out.println("Berechnung der Fakultät");
        System.out.println("Bitte Zahl eingeben:");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        System.out.println(calculateFactorialNumber(number));


    }
    public static long calculateFactorialNumber (int value) {
        if (value < 2){
            return 1;
        }

        //weitere Fälle
        long result = 1;
        int number = 1;
        while (number < value) {
            number++;
            result = result * number;
            //sout("result = " + number)

        }
        return result;
    }
}
