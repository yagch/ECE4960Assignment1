package iNfandNINF;

public class PosINF {
	public PosINF() {
		
	}
	/**Generate infinity number*/
	public double val() {
		return 1.0/0.0;
	}
	/**Calculate 1/INF*/
	public void divide() {
		System.out.println("The result of 1/INF is " + 1/this.val());
	}
	/**Calculate sin(INF)*/
	public void sine() {
		System.out.println("The result of sin(INF) is " + Math.sin(this.val()));
	}
	/**Calculate exp(INF)*/
	public void exponent() {
		System.out.println("The result of exp(INF) is " + Math.pow(Math.E, this.val()));
	}
	/**Detect whether a number is INF*/
	public boolean isPosINF(Double x) {
		return (x > 0) && (1/x == 0.0);
	}
	
}
