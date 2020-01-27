package arrayDemo;

public class ArrayExample1 
{
	public static void main(String[] args)
	{  
		
		int[] age = new int[5];
	      
	      System.out.println(age[0]);
	      System.out.println(age[1]);
	      System.out.println(age[2]);
	      System.out.println(age[3]);
	      System.out.println(age[4]);
	      
	      
	      int[] arr = {1, 9, 9, 5};
			for (int i = 0; i < arr.length; i++)
			{
			    int el = arr[i];
			    System.out.println(el);
			}
	   }
	
	
	/*public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        int length = numbers[2];
        char[] chars = new char[length];
        chars[numbers.length + 4] = 'y';
        System.out.println("Done!");
    }*/
	
	
	
}
