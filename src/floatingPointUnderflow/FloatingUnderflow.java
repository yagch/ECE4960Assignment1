package floatingPointUnderflow;
import helper.*;

public class FloatingUnderflow {
	public double a;
	public double b;
	public int exp;
	helper.Power power = new Power();
	public FloatingUnderflow(double a, double b, int exp) {
		this.a = a;
		this.b = b;
		this.exp = exp;
	}
	  /**Set the value of x*/
	public double xval() {
		return a * power.pow(10, exp);
	}
	  /**Set the value of y*/
	public double yval() {
		return b * power.pow(10, exp);
	}
	  /**Calculate x-y*/
	public double minus() {
		return this.xval() - this.yval();
	}
	/**Calculate x/y*/
	public double divide() {
		return this.xval() / this.yval();
	}
	/**Calculate lim(x to 0) sin(1.23456789012345*(x-y))/(x-y)*/
	public double sine() {
		return Math.sin(1.23456789012345 * this.minus()) / this.minus(); 
	}
}
