package strings;

public class Strings1 {

	public static void main(String[] args) {
		
		String fruit = "apple";   //object created in pool of objects
		System.out.println(fruit);
		
		String fruit1 = fruit;    //refers to apple in pool of objects
		System.out.println(fruit1);
		
		String fruit2 = new String("orange");  //object created in JVM
		System.out.println(fruit2);
		
		String fruit3 = fruit2;
		System.out.println(fruit3);     //refers to orange in JVM

	}

}
// only 2 objects are created :: apple in pool of objects and orange in objects in JVM