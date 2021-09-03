import java.io.*;
import java.util.*;
class factorial
{
public static void main(String [] arg)
{
int n,i,fact=1;
Scanner user_input=new Scanner(System.in);
System.out.print("Enter the values of n:");
n=user_input.nextInt();
for(i=1;i<=n;i++)
{
fact=fact*i;
}
System.out.println("Factorial of"+n+"is:"+fact);
}
}
