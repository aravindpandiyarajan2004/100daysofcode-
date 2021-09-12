import java.io.*;
import java.util.*;
class Duck
{
public static void main(String [] args)
{
checking.display();
}
}
class checking
{
static void display()
{
int n,c,t,r;
Scanner in=new Scanner(System.in);
System.out.print("Enter the values of n:"); 
n=in.nextInt();
System.out.println();
c=0;
t=n;
while(n!=0)
{
r=n%10;
if(r==0) c++;
n=n/10;
}
if(c>0)
{
System.out.print("The given number " + t + " is Duck");
}
else
{
System.out.print("The given number " + t + " is not Duck");
}
}
}

