import java.io.*;
import java.util.*;
class armstrong
{
public static void main(String [] arg)
{
Scanner user_input=new Scanner(System.in);
int n,r,s,t;
System.out.println("enter the values of n:");
n=user_input.nextInt();
t=n;
s=0;
while(n>0)
{
r=n%10;
s=s+(r*r*r);
n=n/10;
}
if(s==t)
{
System.out.println("The given Number is Armstrong");
}
else
{
System.out.println("The given Number is Not Armstrong");
}
System.out.println("the sum is:"+s);
}
}

