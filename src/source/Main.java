package source;

import java.math.BigDecimal;
import java.math.RoundingMode; 

public class Main {
	 public static void main(String [] argc) {
  
		 
//		 long f = (int)((bd.subtract(new BigDecimal(bd.toBigInteger())).floatValue())*100); 
		 	
		 	Double in = 5.22d;
		 	String s = in.toString();
			BigDecimal dec = new BigDecimal(Double.valueOf(in.floatValue()).toString());
			long  luma = (int)((dec.subtract(new BigDecimal(dec.toBigInteger())).longValue() ));
			
			
			BigDecimal bd = new BigDecimal(in).setScale(2, RoundingMode.FLOOR);
		    long n = (int)(bd.subtract(new BigDecimal(in.longValue())).doubleValue()*100);
			
		    long fractPart = (int)(bd.remainder(BigDecimal.ONE).floatValue()*100);
//			StringBuilder sb = new StringBuilder(fractPart.toString());
//			sb.delete(0, 2);
//			String str = sb.toString(); 
			System.out.print(bd + " " +  " "+ n);
	 }
}
