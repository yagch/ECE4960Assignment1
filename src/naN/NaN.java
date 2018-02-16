package naN;
import iNfandNINF.PosINF;

public class NaN {
	PosINF posINF = new PosINF();
	public NaN() {
		
	}
	/**Generate NaN*/
	public double val() {
		return posINF.val() - posINF.val();
	}
	/**Detect whether a number is NaN*/
	public boolean isNaN(double n) {
		if(n == n) 
			return false;
		else
			return true;
	}
}
