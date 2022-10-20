package Cwiczenia3;
import java.util.Scanner;
public class zad3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long paramAjs = scan.nextLong();
        long paramBjs = scan.nextLong();
        long paramCjs = scan.nextLong();
        System.out.println("parametr a = " + paramAjs);
        System.out.println("\nparametr b = " + paramBjs);
        System.out.println("\nparametr c = " + paramCjs + "\n\n");
        switch ((int)paramAjs) {
            case 0: {
                System.out.println("To nie jest równanie kwadratowe gdyż " + paramAjs);
                System.out.println(" jest równy zero\n\n");
            }
            break;
            default: {
                double delta;
                delta = Math.pow(paramBjs, 2) - 4 * paramAjs * paramCjs;
                if (delta < 0) {
                    System.out.println("Brak rozwiązań, gdyż delta < 0.\n");
                } else {
                    if (delta == 0) {
                        long wynik;
                        wynik = -1 * paramAjs * paramBjs / 2;
                        System.out.println("Jedno rozwiązanie o wartości x = " + wynik + "\n\n");
                    } else {
                        double wynik;
                        wynik = (-paramBjs + Math.sqrt(delta)) / (2 * paramAjs);
                        System.out.println("Pierwszy pierwiastek wynosi: " + wynik + "\n");
                        wynik = (-paramBjs - Math.sqrt(delta)) / (2 * paramAjs);
                        System.out.println("Drugi pierwiastek wynosi: " + wynik + "\n");
                    }
                }
            }
        }
    }
}



