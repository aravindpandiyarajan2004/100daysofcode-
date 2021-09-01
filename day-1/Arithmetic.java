import java.io.*;
import java.util.*;

     class Arithmetic
     {
       public static void main(String[]arg)
       {
	   Scanner user_input=new Scanner(System.in);
	   int num1,num2;
	   System.out.println("enter the two numbers:");
           num1=user_input.nextInt();
           num2=user_input.nextInt();
           System.out.println("\nAddition :"+(num1+num2));
           System.out.println("\nsubtraction :"+(num1-num2));
           System.out.println("\nMultiplication :"+(num1*num2));
           System.out.println("\ndivision :"+(num1/num2));
        }
     }


