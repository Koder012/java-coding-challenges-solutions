package workAtech.challenges.bcfb;
import java.util.Scanner;
import java.util.Locale;
public class TestFile {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        GettingDigits.printDigits(scanner);
    }
}
