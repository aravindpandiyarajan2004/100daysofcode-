import java.io.*;
import java.util.*;
class ReverseHill
{
public static void main(String [] args)
{
revhill h=new revhill();
h.display();
}
}
class revhill
{
void display()
{
int n;
Scanner in=new Scanner(System.in);
System.out.print("Enter the values of n:");
n=in.nextInt();
System.out.print("dollar pattern:");
System.out.println();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print("  ");
}
for(int j=i;j<n;j++)
{
System.out.print("$ ");
}
for(int j=i;j<=n;j++)
{
System.out.print("$ ");
}
System.out.println();
}
}
}
