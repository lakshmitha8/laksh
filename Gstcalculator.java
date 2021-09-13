package hello;

public class Gstcalculator {

	public static void main(String[] args) {
		
		int price = 2000;
		double taxAmount;
		
		if(price == 2000) {
			taxAmount = price*0.2/100;
		System.out.println(taxAmount);
		 
		}
		else if(price ==3000) {
		  taxAmount =price*0.3/100;
		  System.out.println(taxAmount);
		}
		else if(price ==4000) {
			  taxAmount =price*0.4/100;
			  System.out.println(taxAmount);
		
     	}
		else if(price ==5000) {
		  taxAmount =price*0.5/100;
		  System.out.println(taxAmount);
     	}
		else if(price ==6000) {
			  taxAmount =price*0.6/100;
			  System.out.println(taxAmount);
		}
	}
}

