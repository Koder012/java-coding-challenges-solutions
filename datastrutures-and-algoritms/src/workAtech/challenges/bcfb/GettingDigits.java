package workAtech.challenges.bcfb;
import java.util.Scanner;
public class GettingDigits {


    public static void printDigits(Scanner scanner){

        System.out.print("enter a two digit No.");
        int number = scanner.nextInt();
        separateDigits(number);
    }

    private static void separateDigits(int number){

        int firstDigit, secondDigit;
        firstDigit = number / 10 ;
        secondDigit = number % 10;
        System.out.printf("\nfirst digit:%d\nsecond digit:%d",firstDigit,secondDigit);

    }
}
