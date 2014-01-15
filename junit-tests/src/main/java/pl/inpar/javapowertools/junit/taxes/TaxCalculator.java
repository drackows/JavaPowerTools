package pl.inpar.javapowertools.junit.taxes;

public class TaxCalculator {

	private static final double pierwszyProgPodatkowy = 3091.00;
	private static final double drugiProgPodatkowy = 85528.00;
	
	public double calculateAmount(double d) {
		if (d<pierwszyProgPodatkowy) 
			return 0.0;
		if (d<drugiProgPodatkowy) {
			return Math.round( (0.18* (d-pierwszyProgPodatkowy)));
		}
		return Math.round( 14839.09 + (0.32 * (d-drugiProgPodatkowy)) );
    }
	
	
}
