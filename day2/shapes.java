import java.io.*;
import java.util.*;
class shapes
{
public static void main(String[]arg)
{
square a=new square();
a.getdata();
a.print();
}
}
class square
{
int s,area;
void getdata()
{
Scanner user_input=new Scanner(System.in);
System.out.print("enter the values of s:");
s=user_input.nextInt();
}
void print()
{
area=s*s;
System.out.println("Area of the square is:"+area);
}
}
 