package source;

import java.math.BigDecimal;
import java.util.LinkedHashMap;

public  class NumberToArmenianWordsSecondEdition {
	@SuppressWarnings("serial")
	private static final LinkedHashMap<Long,String> smaller = new LinkedHashMap<Long,String>(){
		
{
	put(0l,"Զրո ");
	put(1l,"Մեկ ");
	put(2l,"Երկու ");
	put(3l,"Երեք ");
	put(4l,"Չորս ");
	put(5l,"Հինգ ");
	put(6l,"Վեց ");
	put(7l,"Յոթ ");
	put(8l,"Ութ ");
	put(9l,"Ինը ");
	put(10l,"Տաս ");
	put(11l,"Տասնմեկ ");
	put(12l,"Տասներկու ");
	put(13l,"Տասներեք ");
	put(14l,"Տասնչորս ");
	put(15l,"Տասնհինգ ");
	put(16l,"Տասնվեց ");
	put(17l,"Տասնյոթ ");
	put(18l,"Տասնութ ");
	put(19l,"Տասնինը ");
		
	}
	};
	@SuppressWarnings("serial")
	private static final LinkedHashMap<Long,String> bigger = new LinkedHashMap<Long,String>(){
		{	
		put(10l,"Տաս ");
		put(20l,"Քսան ");
		put(30l,"Երեսուն ");
		put(40l,"Քառասուն ");
		put(50l,"Հիսուն ");
		put(60l,"Վաթսուն ");
		put(70l,"Յոթանասուն ");
		put(80l,"Ութսուն ");
		put(90l,"Իննսուն ");
		put(100l,"Հարյուր ");
		put(1000l,"Հազար ");
		put(1_000_000l,"Միլիոն ");
		put(1_000_000_000l,"Միլիարդ ");
		put(1_000_000_000_000l,"Տրիլիոն ");
		
	}
	}; 
	  
	
	private static String convert(Double input) {
		
		
		
		if (input == 0)
			return "";
		else if(input < 20) {
			
			return	smaller.get(max(input.longValue(),smaller));
		}
		else if(input < 1000) {
			if(input/100 > 1 )
				return convert( (input / 100)) + bigger.get(max(input.longValue(),bigger)) + convert( input % 100) 
				 ;
			return bigger.get(max(input.longValue(),bigger)) + convert((input % 100) % 10) ;
			
		}
		else if(input < 2000) {
			if(input/1000 > 1 )
				return (bigger.get(max(input.longValue(),bigger))) + convert(input % 1000)  ;
			return bigger.get(max(input.longValue(),bigger))+ convert(input % 1000)+"Dram";
		}
		else {
			return convert(input / (max(input.longValue(),bigger))) + bigger.get(max(input.longValue(),bigger)) +
					convert(input % max(input.longValue(),bigger)) +"Dram";
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
	
	private static String decimalPart(Double in) {
		BigDecimal dec = new BigDecimal(in.toString());
		long  luma = (int)((dec.subtract(new BigDecimal(dec.toBigInteger())).floatValue())*100);
//		Long luma = lu.longValue();
		if (luma  == 0)
			return "";
		if(luma  < 20) {
			
			return	smaller.get(max(luma,smaller));
		}
		else   {
			return convert( (Long.valueOf(luma).doubleValue() / 100)) + 
					bigger.get(max(luma,bigger)) + convert( Long.valueOf(luma).doubleValue() % 100);
		}
		
	}

public static void main(String [] argc) {
	System.out.println(decimalPart(999888777666555.02d)+"luma");
}
}
