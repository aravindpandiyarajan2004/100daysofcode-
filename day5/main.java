import java.io.*;
import java.util.*;
class main 
{
public static void main(String [] args)
{

interst c=new interst();
c.input();
c.display();
}
}
class compound
{
String name;
double ci;
double p;
double n;
double r;
Scanner in=new Scanner(System.in);
public void input()
{
System.out.print("Enter the Name:");
name=in.nextLine();
System.out.print("Enter the principle:");
p=in.nextDouble();
System.out.print("Enter the rate:");
r=in.nextDouble();
System.out.print("Enter the year:");
n=in.nextDouble();
System.out.println();
}
};
class interst extends compound
{
public void display()
{
ci=p*Math.pow((1 + r/100),n);
System.out.println("Compound Interst is:"+ci);
}
};



 

