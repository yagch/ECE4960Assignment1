package naN;

public class Test {
	NaN nan = new NaN();
	public Test() {
		
	}
	/**Detect whether a number is NaN*/
    public void detect(Double x) {
    	    if(nan.isNaN(x))
    	    	    System.out.println(x + " isn't a number");
    	    else
    	    	    System.out.println(x + " is a number");
    }
    /**Propagation of nAn*/
	public void prop(Double n) {
		System.out.println("NaN + " + n + " = " + (nan.val() + n));
		System.out.println("NaN - " + n + " = " + (nan.val() - n));
		System.out.println("NaN * " + n + " = " + (nan.val() * n));
		System.out.println("NaN / " + n + " = " + (nan.val() / n));
	}
	/**Interaction of NaN*/
	public void inter() {
		System.out.println("NaN + NaN = " + (nan.val() + nan.val()));
		System.out.println("NaN - NaN = " + (nan.val() - nan.val()));
		System.out.println("NaN * NaN = " + (nan.val() * nan.val()));
		System.out.println("NaN / NaN = " + (nan.val() / nan.val()));
	}
}
