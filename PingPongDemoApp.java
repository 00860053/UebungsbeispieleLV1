import java.util.Scanner;

public class PingPongDemoApp {
    public static void main(String[] args) {
        //snippet fori

        for (int number = 1; number < 100; number++) {
            if (number % 6 == 0) {
                System.out.println(number + " Ping Pong");
            }
            else if (number % 2 == 0) {
                System.out.println(number + " Ping");
            }
            else if (number % 3 == 0 ) {
                System.out.println(number + " Pong");
            }
            else System.out.println(number + " -");;
        }
    }

}
