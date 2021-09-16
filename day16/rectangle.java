package pack2;
import java.util.*;
public class rectangle
{
int width,length,area;
Scanner in=new Scanner(System.in);
public void find()
{
System.out.println();
System.out.print("Enter the width :");
width=in.nextInt();
System.out.print("Enter the length:");
length=in.nextInt();
area=width*length;
System.out.print("The area of rectangle is="+area);
}
}