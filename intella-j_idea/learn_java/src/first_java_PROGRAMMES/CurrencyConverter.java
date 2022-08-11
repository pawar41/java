package first_java_PROGRAMMES;

//Input currency in rupees and output in USD

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner inputCurrency = new Scanner(System.in);
        double currencyUsd, currencyInr, perUseRate = 79.4;

        System.out.print("Enter currency in \"United States Dollars\" (USD) :");
        currencyUsd = inputCurrency.nextDouble();
        currencyInr = currencyUsd * perUseRate;

        System.out.println("The currency in USD " + currencyUsd + ", is equal to " + currencyInr + " rupees in INR (Indian Rupee).");
    }
}
