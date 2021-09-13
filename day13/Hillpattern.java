import java.io.*;
import java.util.*;
class HillPattern
{
public static void main(String [] args)
{
hill.display();
}
} 
class hill
{
static void display()
{
int n;
Scanner in=new Scanner(System.in);
System.out.print("Enter the values of n:");
n=in.nextInt();
System.out.println("output:");
for(int i=1;i<=n;i++)
{
for(int j=i;j<=n;j++)
{
System.out.print("  ");
}
for(int j=1;j<i;j++)
{
System.out.print("* ");
}
for(int j=1;j<=i;j++)
{
System.out.print("* ");
}
System.out.println();
}
}
}
