import java.util.*;
/**
 * 
 * @author Hemant Mangwani
 * Here I have learned 
 * Scanner class
 * Functions 
 * Switch case
 * do while loop
 * break statement
 */
public class operation
{

    /**
     * @author Hemant
     * @param args a as a variable
     */
  public static void add()
  {
        Scanner sc= new Scanner(System.in); 
        int a = sc.nextInt();
	int b = sc.nextInt();
	System.out.println("Sum is"+(a+b));
  }
   public static void  sub()
  {
        Scanner sc= new Scanner(System.in); 
        int a = sc.nextInt();
	int b = sc.nextInt();
	System.out.println("sub is"+(a-b));
  }
   public static void  multi()
  {
        Scanner sc= new Scanner(System.in); 
       int a = sc.nextInt();
	int b = sc.nextInt();
	System.out.println("multi is"+(a*b));
  }
  
 public static void main(String args[])
 {
    Scanner sc= new Scanner(System.in); 
   System.out.println("Enter Your Choice\n 1.add\n 2.sub \n 3. multi");

    int choice;
 do
 {
     
    int ch = sc.nextInt(); 
  switch(ch)
   {
      case 1: add();
	    break;
      case 2: sub();
	    break;
      case 3 : multi();
	    break;
              default:
	      System.out.println("Error Input\n");
   }
  
  choice = sc.nextInt();
 }while(choice == 1);
 }

}