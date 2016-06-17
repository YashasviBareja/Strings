package strings;

public class Strings2 {

	public static void main(String[] args)
	{
		String firstname = "yashasvi";
		String lastname = "bareja";
		String completename = firstname + lastname;
		
		System.out.println(completename);
		
		System.out.println(completename.length());
		
	//	System.out.println(completename.reverse());  reverse operation is undefined for type string
		
		char[] charArray = completename.toCharArray();
		
		for( int i=0;i<charArray.length;i++)
		{
			System.out.print(charArray[i]);
		}
		
		System.out.println();
		for(int j=charArray.length-1; j>=0;j--) //reversing the string
		{
			System.out.print(charArray[j]);
		}
	}
}

// Strings are immutable i.e cannot be modified and if modified a new object will 
// be created 
// 3 objects are created in pool of objects