package signedZero;
import iNfandNINF.*;

public class SignedZero {
	int n;    // If n>0, will generate positive zero, else will generate negative zero
	PosINF posINF = new PosINF();
	NegINF negINF = new NegINF();
	public SignedZero(int n) {
		this.n = n;
	}
	/**Generate signed zero*/
	public double val() {
		if(this.n > 0)
			return 1 / posINF.val();
		else
			return 1/ negINF.val();
	}
	/**Detect whether a number is positive zero*/
	public boolean isPosZero(double x) {
		return posINF.isPosINF(1/x);
	}
	/**Detect whether a number is negative zero*/
	public boolean isNegZero(double x) {
		return negINF.isNegINF(1/x);
	}
}
