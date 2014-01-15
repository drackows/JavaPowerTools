package pl.inpar.javapowertools.junit.taxes;

public class TaxCalculator {

	private static final double kwotaWolnaOdPodatku = 3091.00;
	
	public double calculateAmount(double d) {
		if (d<kwotaWolnaOdPodatku) return 0.0;
	    return Math.round(0.18 * (d-kwotaWolnaOdPodatku));
    }
	
	
}
