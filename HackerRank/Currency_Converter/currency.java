package Top_100_codes.Currency_Converter;

// import java.io.*;
import java.util.*;
import java.text.*;
// import java.math.*;
// import java.util.regex.*;

public class currency {
    
    public static void main(String[] args) {
        System.out.print("currency: ");
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.

        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat IndiaFormat = NumberFormat.getCurrencyInstance(new Locale("en","IN")); 
        NumberFormat ChainaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA); 
        NumberFormat FranceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE); 

        String us = usFormat.format(payment);
        String india = IndiaFormat.format(payment);
        String china = ChainaFormat.format(payment);
        String france = FranceFormat.format(payment);
    
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}