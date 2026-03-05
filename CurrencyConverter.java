import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String, Double> rates = new HashMap<>();
        rates.put("USD", 1.0);
        rates.put("INR", 83.0);
        rates.put("EUR", 0.92);
        rates.put("GBP", 0.78);
        rates.put("JPY", 150.0);

        System.out.println("------ Currency Converter ------");

        System.out.println("Available currencies: USD, INR, EUR, GBP, JPY");

        System.out.print("Enter base currency: ");
        String base = sc.next().toUpperCase();

        System.out.print("Enter target currency: ");
        String target = sc.next().toUpperCase();

        if (!rates.containsKey(base) || !rates.containsKey(target)) {
            System.out.println("Invalid currency selected.");
            return;
        }

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        double amountInUSD = amount / rates.get(base);

        double convertedAmount = amountInUSD * rates.get(target);

        System.out.println("\nConverted Amount: " + convertedAmount + " " + target);

        sc.close();
    }
}