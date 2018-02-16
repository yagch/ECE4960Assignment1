package floatingPointOverflow;
import helper.*;

public class FloatingPoint {
	public Double a;
	public int b;
	public FloatingPoint(Double a, int b) {
		this.a = a;
		this.b = b;
	}
	Power power = new Power();
	public Double val() {
		return a * power.pow(10, b);
	}
}
