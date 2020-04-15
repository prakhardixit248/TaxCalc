import java.io.*;
import java.util.*;

public class Inputval 
{
	Item Individual() 
    {
	  
   	 String name , str, typer ;
	 
   	 double price;
	 
   	 int quantity;
	 
   	 Scanner in=new Scanner(System.in);
	 
   	 Item item=null;
	 
   	 PrintWriter prn=new PrintWriter(System.out,true);
	 
   	 prn.println(" Enter Input String ");
   	 prn.println(" Item Name \n Type :- Raw , Manufactured , Imported");
   	 prn.println(" Enter Price per Item \n Enter Quantity");
	 
   	 str=in.nextLine();
   	 
	 
   	 str=str.replaceAll("\\s", "");
	 
   	 String[] st=str.split("-");
	 
   	 try
   	 {
	
			 name=st[1];
			 
			 typer=st[2];
			 
			 price=Double.parseDouble(st[3]);
			 
			 quantity=Integer.parseInt(st[4]);
			 

			 item=new Item();
			 
			 switch(typer.toLowerCase())
			 {
			 	case "raw" :
			 		item.setType(1); 
			 		break;
			 		
			 	case "imported" :
			 		item.setType(3);
			 		break;
			 		
			 	case "manufactured" :
			 		item.setType(2);
			 		break;
			 	default :
			 		item.setType(8);
				 
			 }
		    		 
			 item.setName(name);
			 
			 item.setPrice(price);
			 
			 item.setQuantity(quantity);
   	 
   	 }
   	 catch(Exception e)
   	 {
   		 
   		 e.printStackTrace();
   		 
   	 }
   		 return item;
}
}
