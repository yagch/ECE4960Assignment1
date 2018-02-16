package calculateπ;
import java.math.BigDecimal;

import helper.*;

public class Pi {
	public int n;    // The precision of calculating
	public Pi(int n) {
		this.n = n;
	}
	/**π=176·arctan(1/57)+28·arctan(1/239)−48·arctan(1/682)+96·arctan(1/12943)	 */
    public void impl( ) { 
        BigDecimal part1 = arctan(57).multiply(new BigDecimal(176));  
        BigDecimal part2 = arctan(239).multiply(new BigDecimal(28));  
        BigDecimal part3 = arctan(682).multiply(new BigDecimal(-48));  
        BigDecimal part4 = arctan(12943).multiply(new BigDecimal(96));  
        BigDecimal res = part1.add(part2).add(part3).add(part4);  
        System.out.println(res.toString().substring(0, 32));  
    }  
      
    public BigDecimal arctan(int x){  
    	    int n2 = this.n + 2;    // Avoid the error
        BigDecimal result = BigDecimal.ZERO;  
        BigDecimal xsquare = new BigDecimal(x*x);  
        BigDecimal bigx = new BigDecimal(x);  
        BigDecimal temp;  
        BigDecimal res = BigDecimal.ONE.divide(bigx , n2, BigDecimal.ROUND_HALF_EVEN);  
          
        boolean b = true;  
        for(int i=1;;i+=2){  
            temp = res.divide(new BigDecimal(i), n2, BigDecimal.ROUND_HALF_EVEN);  
            if(temp.compareTo(BigDecimal.ZERO)==0){
                break;  
            }  
            if(b){  
                result = result.add(temp);  
            }else{  
                result = result.subtract(temp);
            }  
            b = !b;  
            res = res.divide(xsquare, n2, BigDecimal.ROUND_HALF_EVEN);  
        }  
        return result;  
    }  
}
