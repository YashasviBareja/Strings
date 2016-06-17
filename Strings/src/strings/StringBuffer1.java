package strings;

public class StringBuffer1 {

	public static void main(String[] args) 
	{
		StringBuffer name = new StringBuffer("sachin");
		
		name.append("tendulkar");
		System.out.println(name); // only 1 name object is created instead of 3 
	
		//System.out.println("reverse::"+name.reverse());
		System.out.println("substring::" +name.substring(4, 6));
		System.out.println(name.substring(4));
		System.out.println(name.length());
		
		char[] chararray = name.toString().toCharArray();
		
		for(int i=0;i<chararray.length;i++)
		{
			System.out.print(chararray[i]);
		}
	}
}
// String buffer are mutable i.e can be modified without creation of a new object
//memory optimization