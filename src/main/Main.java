package main;
import integerOverflow.*;
import integerDividedBy0.*;
import calculateπ.Pi;
import floatingPointOverflow.*;
import iNfandNINF.*;
import naN.*;
import signedZero.*;
import floatingPointUnderflow.*;
import helper.*;
import calculateπ.*;
import java.io.FileNotFoundException;   
import java.io.PrintStream;  

/** @author Haohan Chen - hc937
 * @since 1.0
 * @version 1.0
*/ 
public class Main {
	public static void main(String[] arg) {
		/**generate report*/ 
		try{
		       PrintStream out = new PrintStream("/Users/chenhaohan/eclipse-workspace/Assignment1/report2");
		                 System.setOut(out);
		   }catch(FileNotFoundException e){
		       e.printStackTrace();
		   }
		System.out.println("ECE4960 Programming Assignment1");
		System.out.println("@author Haohan Chen - hc937");
		System.out.println("@Language: Java");
		System.out.println("@Platform: Eclipse");
		System.out.println("@OS: MacOS");
		System.out.println("@since 1.0");
		System.out.println("@version 1.0");
		System.out.println("@02/14/2018");
		System.out.println(" ");
		/**implement integer overflow 
		 * use multiplication, factorial and Fibonossi
		*/ 
		integerOverflow.Test test1 = new integerOverflow.Test();
		System.out.println("1.Implement and observe integer overflows");
		System.out.println("(1) Use multiplication to cause integer overflow");
		test1.implMulti(5000, 5000);
		test1.implMulti(500000, 500000);
		System.out.println("(2) Use factorial to cause integer overflow");
		test1.implFact();
		System.out.println("(3) Use Fibonossi numbers to cause integer overflow");
		test1.implFib();
		integerDividedBy0.Test test2 = new integerDividedBy0.Test();
		System.out.println(" ");
		/** implement integer divided by zero*/ 
		System.out.println("2. Divide 1 by 0 to create the exception");
		try {
			test2.impl(1);
		}catch(ArithmeticException e) {
			System.out.println("Exceprion thrown :" + e);
		}
		System.out.println(" ");
		/** implement floating-point overflows*/ 
		System.out.println("3. Implement floating-point overflow and compare the result to infinity and max floating-point number");
		floatingPointOverflow.Test test3 = new floatingPointOverflow.Test(1.2, 300);
		test3.impl();
		System.out.println(" ");
		/** implement floating-point operations of INF and NINF*/ 
		System.out.println("4. Generate and implement INF and NINF");
		iNfandNINF.Test test4 = new iNfandNINF.Test();
		System.out.println("(1) Observe the behavior of INF");
		test4.function(1);
		System.out.println("(2) Observe the behavior of NINF");
		test4.function(-1);
		System.out.println("(3) Test the propogation of INF");
		test4.prop(2.0);
		System.out.println("(4) Test the propogation of NINF");
		test4.prop(-2.0);
		System.out.println("(5) Test the Interaction of INF");
		test4.inter();
		helper.Power power = new Power();
		System.out.println("(6) Test whether 1.2 * 10^310 is infinity");
		test4.isINF(1.2 * power.pow(10.0, 310));
		System.out.println(" ");
		/** implement floating-point operations of NaN*/ 
		System.out.println("5. Operation of NaN");
		naN.Test test5 = new naN.Test();
		System.out.println("(1) Detect whether 1.0 and 0.0/0.0 are numbers");
		test5.detect(1.0);
		test5.detect(0.0/0.0);
		System.out.println("(2) Observe the propogation of NaN");
		test5.prop(2.0);
		System.out.println("(3) Observe the interaction of NaN");
		test5.inter();
		System.out.println(" ");
		/** implement signed zero*/ 
		System.out.println("6. Generate and observe signed zero");
		signedZero.Test test6 = new signedZero.Test();
		System.out.println("1) Observe the signed zero handling");
		test6.operat();
		System.out.println("(2) Detect whether a number is a signed zero");
		test6.detect(0);
		System.out.println(" ");
		/** implement floating-point gradual underflow*/ 
		System.out.println("7. Observation of floating-point gradual underflow");
		floatingPointUnderflow.Test test7 = new floatingPointUnderflow.Test(1.2345678, 1.2345677, -300);
		test7.perform();		
		System.out.println(" ");
		/** Calculate π and display 30 digits*/ 
		System.out.println("8. Calculate π and display 30 digits");
		System.out.println("Referenced: http://turner.faculty.swau.edu/mathematics/materialslibrary/pi/piforms.html");
		System.out.println("The value of π is:");
		calculateπ.Pi pi = new calculateπ.Pi(30);
		pi.impl();
	}
}
