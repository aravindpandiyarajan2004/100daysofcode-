package bill;
import java.io.*;
import java.util.*;
public class product
{
public void input()
{
Scanner in=new Scanner(System.in);
Scanner ins=new Scanner(System.in);
int pid,Qty,n;
String pname;
float price,amt;
n=0;
do
{
System.out.print("Enter the product Id:");
pid=in.nextInt();
System.out.print("Enter the price:");
price=in.nextFloat();
System.out.print("Enter the product name:");
pname=ins.nextLine();
System.out.print("Enter the Quantity:");
Qty=in.nextInt();
amt=price*Qty;
System.out.print("The total amount is= "+amt);
System.out.println();
System.out.print("Do you want do continue:");
n=in.nextInt();
System.out.println("------------------------------");
}while(n==1);
}
}