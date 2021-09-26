import java.io.*;
import java.util.*;
class bankapp
{
public static void main(String [] args)
{
System.out.println("****-----------------------------------------****");
System.out.println("|             BANK APPLICATION                   |");
System.out.println("****-----------------------------------------****");
Scanner in=new Scanner(System.in);
int ch;
System.out.print("1.Deposit  \n2.withdraw\nEnter your choice:");
ch=in.nextInt();
switch(ch)
{
case 1:
{
SBI s=new SBI();
s.getdetails();
s.withdraw();
break;
}
case 2:
{
SBI s=new SBI();
s.getdetails();
s.deposit();
break;
}
}
}
}
class Bank
{
final String ifsc="SBI3546930293";
String CustomerName;
Double AccountNumber;
Scanner in=new Scanner(System.in);
void getdetails()
{
System.out.println("IFSC Number is:"+ifsc);
System.out.print("Enter The Customer Name:");
CustomerName=in.nextLine();
System.out.print("Enter The Account Number:");
AccountNumber=in.nextDouble();
}
}
class SBI extends Bank
{
void withdraw()
{
double balance=5000;
double withdraw;
System.out.print("Enter the withdraw:");
withdraw=in.nextDouble();
balance=balance-withdraw;
System.out.print("Balance="+balance);
}
void deposit()
{
double balance=5000;
double deposit;
System.out.print("Enter the Deposit:");
deposit=in.nextDouble();
balance=balance+deposit;
System.out.print("Balance ="+balance);
}
}
