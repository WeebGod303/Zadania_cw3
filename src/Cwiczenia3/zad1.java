package Cwiczenia3;
import java.util.Scanner;
public class zad1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe: ");
        float firstjs = scan.nextFloat();
        System.out.println("Podaj drugą liczbe: ");
        float secondjs = scan.nextFloat();
        float sumajs = firstjs + secondjs;
        float roznicajs = firstjs - secondjs;
        float iloczynjs = firstjs * secondjs;
        float ilorazjs = firstjs/secondjs;
        System.out.printf("Suma tych liczb to: %.2f %n", sumajs);
        System.out.printf("Różnica tych liczb to: %.2f %n", roznicajs);
        System.out.printf("Iloczyn tych liczb to: %.2f %n", iloczynjs);
        System.out.printf("Iloraz tych liczb to: %.2f %n", ilorazjs);
    }
}
