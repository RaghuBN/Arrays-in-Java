
package arrayDemo;// Java program to illustrate creating an array of objects

class Employee {
	
	  public int emp_id;
	  public String emp_name;
	  
	  Employee(int emp_id, String emp_name)
	  {
	    this.emp_id = emp_id;
	    this.emp_name = emp_name;
	  }
		}
		public class ArrayOfObject {
		  public static void main (String[] args)
		  {
			  Employee[] employeeArray;
		    employeeArray = new Employee[5];
		    employeeArray[0] = new Employee(1,"Dharma Teja");
		    employeeArray[1] = new Employee(2,"Harshita");
		    employeeArray[2] = new Employee(3,"Kalyan Babu");
		    employeeArray[3] = new Employee(4,"SreePriya");
		    employeeArray[4] = new Employee(5,"Narashima Rao");
		    employeeArray[5] = new Employee(6,"RamPrasad");
		    
		    for (int i = 0; i < employeeArray.length; i++)
		    System.out.println("Element at " + i + " : " +employeeArray[i].emp_id 
		    		             +" "+ employeeArray[i].emp_name);
		  }
}
