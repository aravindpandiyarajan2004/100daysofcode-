package pack1;
import java.util.*;
public class square
{
int a,area;
Scanner in=new Scanner(System.in);
public void find()
{
System.out.print("Enter the values of a:");
a=in.nextInt();
area=a*a;
System.out.println("The area of square " + a + " is:"+area);
}
}