package squ;
import java.util.*;
public class squarevalue
{
int square,n;
public void input()
{
Scanner in=new Scanner(System.in);
System.out.print("Enter the value of n:");
n=in.nextInt();
for(int i=1;i<=n;i++)
{
square=n*n;
}
System.out.println("The square value is:"+square);
}
}