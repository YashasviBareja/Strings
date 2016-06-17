package strings;

public class StringBuffer2 {

	public static void main(String[] args) 
	{
		StringBuffer value1 = new StringBuffer("India");
		
		System.out.println(value1);
		System.out.println(value1.toString().toLowerCase());
		System.out.println(value1.toString().toUpperCase());
		
		String value2= "apple";
		String value3= "Apple";
		
		if(value2.equalsIgnoreCase(value3))
		{
			System.out.println("strings are equal");
		}
			else 
			System.out.println("not equal");
		}
	}

