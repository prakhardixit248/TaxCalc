import java.util.*;
public class ItemInt
{
	     ArrayList<Item> valueStore() throws Exception
	     {
	    	 ArrayList<Item> al=new ArrayList<>();
	    	 
	    	 Item item = null;
	    	 
	    	 char ch='y';
	    	 
			 
			 TaxCalc taxcalc=new TaxCalc();
	    	 
	    	 Validate validate=new Validate();
	    	 
	    	 Inputval inputval=new Inputval();
	    	 
	    	 Scanner in=new Scanner(System.in);
	    	 
	    	 try
	    	 {
	    	 
	    	 while(ch=='y')
	    	 {
	    		 
	    	    item=inputval.Individual();
	    	    
	    	    if(validate.validation(item))
	    	    {
	    	    	
	   	    	 item=taxcalc.calculate(item);
	    		 
	    	     al.add(item);
	    	    
	    	    }
	    	    
	    	    else
	    	    	
	    	    	System.out.println("Invalid Input!!!!!!! ");
	    	
	    	    
	    	    System.out.println("Do you want to enter details of any other item (y/n):");
	    	    
	    	    ch=in.next().charAt(0);
	    	    
	    	 }
	    	 
	   }
	    	 catch(Exception e)
	    	 {
	    		 e.printStackTrace();
	    	 }
	    	 return al;
	    	 
	  }
}
