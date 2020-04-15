
public class TaxCalc 
{
	Item calculate(Item item)
	{
		int type=item.getType();
		
		double price=item.getPrice(),tax,surcharge,tcost;
		
		tax=0.125*price;
		
		if(type==2)
			
		tax=tax+0.02*(price+tax);	
		
		else if(type==3)
		{
			tax=0.1*price;
			
			tcost=1.1*price;
			
			surcharge=(tcost <= 100 )? 5 : (tcost <= 200)? 10 : 0.05*tcost;
			
			tax=tax+surcharge;
			
		}
		
		item.setTax(tax);
		
		tax=(tax+price)*item.getQuantity();
		
		item.setFprice(tax);
		
		return item;
		
	}
}
