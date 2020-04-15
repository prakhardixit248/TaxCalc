
public class Validate
{
	boolean validation(Item item) throws Exception
	{
		 boolean val=false;
		 
		 String name=item.getName();
		 
	   	 int type=item.getType();
	   	 
		 String regexName = "(\\p{Upper}+\\p{Lower}+\\s?)";
		 
	     String patternName = "(" + regexName + "){1,3}";
	     
	     val=name.matches(patternName) &&  (type>0  &&  type<4);
	 
	     return val;
	}
}