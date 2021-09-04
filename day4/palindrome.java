import java.io.*;
import java.util.*;
class palindrome
{
public static void main(String [] arg)
{
int s,r,t,n;
Scanner user_input=new Scanner(System.in);
System.out.print("Enter the values of n:");
n=user_input.nextInt();
s=0;
t=n;
while(n>0)
{
r=n%10;
s=(s*10)+r;
n=n/10;
}
if(s==t)
{
System.out.println("The given number is palindrome:"+s);
}
else
{
System.out.println("The given number is not palindrome:"+s);
}
}
}