package source;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map; 

public  class NumberToArmenianWordsSecondEdition {
	private static final LinkedHashMap<Integer,String> smaller = new LinkedHashMap<Integer,String>(){
		
{
	put(0,"Զրո ");
	put(1,"Մեկ ");
	put(2,"Երկու ");
	put(3,"Երեք ");
	put(4,"Չորս ");
	put(5,"Հինգ ");
	put(6,"Վեց ");
	put(7,"Յոթ ");
	put(8,"Ութ ");
	put(9,"Ինը ");
	put(10,"Տաս ");
	put(11,"Տասնմեկ ");
	put(12,"Տասներկու ");
	put(13,"Տասներեք ");
	put(14,"Տասնչորս ");
	put(15,"Տասնհինգ ");
	put(16,"Տասնվեց ");
	put(17,"Տասնյոթ ");
	put(18,"Տասնութ ");
	put(19,"Տասնինը ");
		
	}
	};
	private static final LinkedHashMap<Integer,String> bigger = new LinkedHashMap<Integer,String>(){
		{	
		put(10,"Տաս ");
		put(20,"Քսան ");
		put(30,"Երեսուն ");
		put(40,"Քառասուն ");
		put(50,"Հիսուն ");
		put(60,"Վաթսուն ");
		put(70,"Յոթանասուն ");
		put(80,"Ութսուն ");
		put(90,"Իննսուն ");
		put(100,"Հարյուր ");
		put(1000,"Հազար ");
		put(1_000_000,"Միլիոն ");
		put(1_000_000_000,"Միլիարդ ");
//		put(1_000_000_000_000,"Տրիլիոն");
		
	}
	};
	private static  String result ;
	  
	
	private static String convert(Integer input) {
		
		if (input == 0)
			return "";
		if(input < 20) {
			
			return	smaller.get(max(input,smaller));
		}
		else if(input < 1000) {
			if(input/100 > 1 )
				return convert( (input / 100)) + 
						bigger.get(max(input,bigger)) + 
						convert( input % 100) ;
			return bigger.get(max(input,bigger)) +
					convert((input % 100) % 10);
			
		}
		else if(input < 2000) {
			if(input/1000 > 1 )
				return (bigger.get(max(input,bigger))) + convert(input % 1000);
			return bigger.get(max(input,bigger))+ convert(input % 1000);
		}
		else {
			return convert(input / (max(input,bigger))) +
					bigger.get(max(input,bigger)) +
					convert(input % max(input,bigger));
		}
	} 
	private static   int max(Integer num, LinkedHashMap<Integer, String>search ) {
		Integer number = 0;
		 for(Integer key :search.keySet()){
			 	if(key.intValue()==num.intValue()) {
	            	number = key.intValue();
	            	break;
	            }
			 	else if(key.intValue() < num.intValue()) 
	            	number = key.intValue();
	            
//			 	if(i == 100 || num == 1000) {
			 		
			 	}
		 	return number;
	        }

		
		
//		Iterator fd = search.entrySet().iterator();
//		while(fd.hasNext()) {
//			Map.Entry me = (Map.Entry)fd.next();
//			if(search.getKey().intValue() <=num) {
//				number =  search.getKey().intValue();
//				
//			}
//		}
		
		
		
	
public static void main(String [] argc) {
	System.out.println(NumberToArmenianWordsSecondEdition.convert(234567890));
}
}
