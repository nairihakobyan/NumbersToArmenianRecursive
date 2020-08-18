package source;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.LinkedHashMap;
import java.util.Scanner;

public  class NumberToArmenianWordsSecondEdition {
	@SuppressWarnings("serial")
	private static final LinkedHashMap<Long,String> smaller = new LinkedHashMap<Long,String>(){
		
{	put(0l,"");put(1l,"Մեկ ");put(2l,"Երկու ");put(3l,"Երեք ");put(4l,"Չորս ");put(5l,"Հինգ ");put(6l,"Վեց ");
	put(7l,"Յոթ ");put(8l,"Ութ ");put(9l,"Ինը ");put(10l,"Տաս ");put(11l,"Տասնմեկ ");put(12l,"Տասներկու ");
	put(13l,"Տասներեք ");put(14l,"Տասնչորս ");put(15l,"Տասնհինգ ");put(16l,"Տասնվեց ");put(17l,"Տասնյոթ ");put(18l,"Տասնութ ");
	put(19l,"Տասնինը ");
		}
	};
	@SuppressWarnings("serial")
	private static final LinkedHashMap<Long,String> bigger = new LinkedHashMap<Long,String>(){
		{	
		put(10l,"Տաս ");put(20l,"Քսան ");put(30l,"Երեսուն ");put(40l,"Քառասուն ");put(50l,"Հիսուն ");put(60l,"Վաթսուն ");
		put(70l,"Յոթանասուն ");put(80l,"Ութսուն ");put(90l,"Իննսուն ");put(100l,"Հարյուր ");put(1000l,"Հազար ");
		put(1_000_000l,"Միլիոն ");put(1_000_000_000l,"Միլիարդ ");put(1_000_000_000_000l,"Տրիլիոն ");
		}
	}; 
	  
	private static String convert(Double input) {
		if(input < 20) {
			 return	smaller.get(max(input.longValue(),smaller));
		}
		else if(input < 100) {
			return bigger.get(max(input.longValue(),bigger))+ convert(input % 10 );
		}
		else if(input < 1000) {
			if(input/100 >= 2 )
				return convert( (input / 100)) + bigger.get(max(input.longValue(),bigger)) + convert( input % 100) ;
			return bigger.get(max(input.longValue(),bigger)) + convert((input % 100) ) ;
			
		}
		else if(input < 10000) {
			if(input / 1000 >= 2 )
				return convert( (input / 1000))+(bigger.get(max(input.longValue(),bigger))) + convert(input % 1000)  ;
			return bigger.get(max(input.longValue(),bigger))+ convert(input % 1000);
		}
		else {
			return convert(input / (max(input.longValue(),bigger))) + bigger.get(max(input.longValue(),bigger)) +
					convert(input % max(input.longValue(),bigger)) ;
		}
	} 
	
	private static   Long max(Long num, LinkedHashMap<Long, String>search ) {
		 Long number = 0l;
		 for(Long key :search.keySet()){
			 	if(key == num) {
	            	number =  key;
	            	break;
	            }
			 	else if(key  < num) 
	            	number =  key;
	      }
		 return number;
	}
	
	private static String decimalPart(String in) {
		BigDecimal bd = new BigDecimal(in).setScale(2, RoundingMode.FLOOR);
	    long luma = (long) (bd.remainder( BigDecimal.ONE ).doubleValue()*100);
 
		if (luma  == 0)
			return "Զրո ";
		if(luma  < 20) {
			return	smaller.get(max(luma,smaller));
		}
		else   {
			return  bigger.get(max(luma,bigger)) + convert( Long.valueOf(luma).doubleValue() % 10);
		}
	}

public static void main(String [] argc) {
	
//	Scanner scan = new Scanner(System.in); 
//	for(int i = 0; i < 10;i++) {
//		System.out.println("Enter a number: \n");
//		Double num = scan.nextDouble();
		Double num=12345667788d;
		if(num < 1000000000000000l && num > 0)
			System.out.println(convert(num) + " Դրամ " + decimalPart(num.toString()) + " Լումա \n");
		else if(num == 0)System.out.println("Զրո Դրամ Զրո Լումա");
		else { System.out.println("Wrong input , try again:\n "); }
	}
//	scan.close();
	
}
}
