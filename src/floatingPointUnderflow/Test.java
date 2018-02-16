package floatingPointUnderflow;

public class Test {
	public double a;
	public double b;
	public int exp;
	public Test(double a, double b, int exp) {
		this.a = a;
		this.b = b;
		this.exp = exp;
	}
	
	/**Output the result of calculation until underflow happens*/
	public void perform() {
		int hel = 0;
		while(hel == 0){
			FloatingUnderflow floatingU = new FloatingUnderflow(a, b, exp);
			System.out.println(a + " * 10^" + exp + " - " + b + " * 10^" + exp + " = " + floatingU.minus());
			System.out.println(a + " * 10^" + exp + " / " + b + " * 10^" + exp + " = " + floatingU.divide());
			System.out.println("lim(x to 0) sin(1.23456789012345*x)/x = " + floatingU.sine());
            if(floatingU.xval() == 0 && floatingU.yval() == 0 && floatingU.minus() == 0)
            	    hel = 1;
            this.exp -= 1;
		}
	}
}
