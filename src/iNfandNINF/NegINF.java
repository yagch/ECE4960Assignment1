package iNfandNINF;

public class NegINF {
	public NegINF() {
		
	}
	/**Generate negative infinity number*/
	public double val() {
		return -1.0/0.0;
	}
	/**Calculate 1/NINF*/
	public void divide() {
		System.out.println("The result of 1/NINF is " + 1/this.val());
	}
	/**Calculate sin(NINF)*/
	public void sine() {
		System.out.println("The result of sin(NINF) is " + Math.sin(this.val()));
	}
	/**Calculate exp(NINF)*/
	public void exponent() {
		System.out.println("The result of exp(NINF) is " + Math.pow(Math.E, this.val()));
	}
	/**Detect whether a number is NINF*/
	public boolean isNegINF(Double x) {
		return (x < 0) && (1/x == 0.0);
	}
}
