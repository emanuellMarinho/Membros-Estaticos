package entities;

public class CurrencyConverter {

	// Constante
	public static final double IOF = 0.06;

	public static double convertToReal(double amountInDollars, double exchangeRate) {
		double totalInReais = amountInDollars * exchangeRate * (1 + IOF);
		return totalInReais;
	}
}
