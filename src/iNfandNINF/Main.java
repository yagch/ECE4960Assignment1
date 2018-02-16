package iNfandNINF;
import helper.*;

public class Main {
	public static void main(String[] args) {
		
		Test test = new Test();
		test.function(1);
		test.function(-1);
		test.prop(2.0);
		test.prop(-2.0);
		test.inter();
		helper.Power power = new Power();
		test.isINF(1.2 * power.pow(10.0, 310));
	}
}
