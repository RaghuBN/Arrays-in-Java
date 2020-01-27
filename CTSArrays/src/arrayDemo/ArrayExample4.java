package arrayDemo; //access and alter array elements by using its numeric index

public class ArrayExample4 {
	public static void main(String[] args)
	{
	      int[] age = new int[5];
	      
	      // insert 143 to third element
	      age[2] = 143;
	      
	      // insert 134 to first element
	      age[0] = 134;
	      
	      //age[5]= 234;
	      
	      for (int i = 0; i < 5; ++i)
	      {
	         System.out.println("Element at index " + i +": " + age[i]);
	      }
	   }
}
