package floatingPointOverflow;

public class Test {
	public Double a;
	public int b;
	public Test(Double a, int b) {
	    this.a = a;
	    this.b = b;
	}
	public Double val() {
		FloatingPoint floatp = new FloatingPoint(a, b);
		return floatp.val();
	}
    public void impl() {
    	    int helper = b;
    	    while(!compareToINF()) {
    	    	    this.b += 1;
    	    }
    	    this.b = helper;
    	    while(!compareToMaxVal()) {
    	    	    this.b += 1;
    	    }
    }
    /**Compare the number to infinity to check floating-point overflow*/
	public boolean compareToINF() {
		if(this.val() == Double.POSITIVE_INFINITY || this.val() == Double.NEGATIVE_INFINITY) {
			System.out.println("Compared to infinity, " + a + " * 10^" + b + " overflows");
			return true;
		}
		else {
			System.out.println("Compared to infinity, " + a + " * 10^" + b + " doesn't overflow, the value is" + this.val());
			return false;
		}
	}
	  /**Compare the number to max floating-point number to check floating-point overflow*/
	public boolean compareToMaxVal() {
		if(this.val() > Double.MAX_VALUE || this.val() < Double.MIN_VALUE) {
			System.out.println("Compared to max floating point number, " + a + " * 10^" + b + " overflows");
			return true;
		}
			
		else {
			System.out.println("Compared to max floating point number, " + a + " * 10^" + b + " doesn't overflow, the value is" + this.val());
			return false;
		}
	}
}
