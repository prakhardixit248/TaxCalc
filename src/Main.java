import java.util.*;
public class Main 
{
	public static void main(String pr[]) throws Exception
	{
		ItemInt i=new ItemInt();
		
		ArrayList<Item> al=i.valueStore();
		
		Item it;
		
		Iterator<Item> itr = al.iterator();
		
		if(itr.hasNext())
			
		{
			System.out.println("Name  Price Tax Final Price ");
		}
		
		
		 while(itr.hasNext())
		 {
			 
			 it=(Item)itr.next();
			 
			 System.out.println(it.getName() +" "+ it.getPrice()+ " " + it .getTax()+" "+it.getFprice());
		 }
		 
	}
}
