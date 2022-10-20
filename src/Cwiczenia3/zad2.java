package Cwiczenia3;
import java.util.Scanner;
public class zad2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Weight =");
        float weightjs= scan.nextFloat();
        System.out.println("Height =");
        float heightjs= (scan.nextFloat())/100;

       float value=(float) (weightjs/ Math.pow(heightjs,2));
        System.out.println("BMI ="+value);
        if(value<16f)System.out.println("Wygłodzenie");
        else if(value<17f)System.out.println("Wychudzenie");
        else if(value<18.5f)System.out.println("Niedowaga");
        else if(value<23f)System.out.println("Norma niski przedział");
        else if(value<24f)System.out.println("Norma wsyoki przedział");
        else if(value<27.5f)System.out.println("Nadwaga niski przedział");
        else if(value<30f)System.out.println("Nadwaga wysoki przedział");
        else if(value<35f)System.out.println("Otyłość 1 stopnia");
        else if(value<39.9f)System.out.println("otyłość 2 stopnia");
        else if(value<40f)System.out.println("otyłość 3 stopnia");



    }
}
