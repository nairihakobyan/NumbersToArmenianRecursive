package source;

import java.math.BigDecimal; 

public class Main {
	 public static void main(String [] argc) {
  
		 BigDecimal bd = new BigDecimal("999888777666555.02");
		 long f = (int)((bd.subtract(new BigDecimal(bd.toBigInteger())).floatValue())*100); 
		 System.out.print(f);
	 }
}
