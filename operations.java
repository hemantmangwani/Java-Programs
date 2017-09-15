import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Hemant
 */
abstract class op
{
    public int a,b,ans;
    abstract void getno();
    abstract void cal();
    abstract void printt();
}

class sum extends op
{
    void getno()
    {
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();  
    }
    void cal()
    {
        ans=a+b;
    }
    void printt()
    {
      System.out.println("Sum is = "+ ans);
    }
}
class multi extends op
{
    void getno()
    {
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
    }
    void cal()
    {
        ans=a*b;
    }
    void printt()
    {
      System.out.println("multi is = "+ ans);
    }
}
class sub  extends op
{
    void getno()
    {
         Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        b=sc.nextInt();
    }
    void cal()
    {
        ans=a-b;
    }
    void printt()
    {
     System.out.println("Sub is = "+ ans );
    }
}

public class operations 
{
    public static void main(String[] args) {
        while(true)
        {
            System.out.println("Enter your choice \n 1. add \n 2. sub \n 3. multi \n4. exit");
        
           Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        if(ch==1)
        {
        sum s = new sum();
        s.getno();
        s.cal();
        s.printt();
        }
        else if(ch==2)
        {
        sub su = new sub();
        su.getno();
        su.cal();
        su.printt();
        }
        else if(ch==3)
        {
        multi m = new multi();
        m.getno();
        m.cal();
        m.printt();
        }
        else if(ch==4)
            System.exit(0);
        else
            System.out.println("Invalid \n");
    }
   }
}
