/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hemantmangwani;

import java.util.Scanner;

/**
 *
 * @author Hii
 * here we demonstrate static member and fuction
 * we can call them without making there object
 */
    class hemu
    {
       public static int a,b,total;
       public static void getno()
       {
           System.out.println("Enter a no for which you want a table");
          Scanner sc=new Scanner(System.in);
          a= sc.nextInt();
          b= sc.nextInt();
       }    
       public static void table()
       {
           for(int i=1;i<=b;i++)
           {
               total = a*i;
               System.out.print(a +" X ");
               System.out.print(i +" = ");
               System.out.println(total);
           }
           
           
       }
        
    }
public class staticexample {

     public static void main(String[] args) {
         hemu.getno();
         hemu.table();
         
     }
}
