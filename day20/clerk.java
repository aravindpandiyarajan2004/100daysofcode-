import java.io.*;
import java.util.*;
class clerk 
{
public static void main(String [] args)
{
System.out.println("****------------------------------------------****");
System.out.println("|                 EMPLOYEE DETAILS                |");
System.out.println("****------------------------------------------****");
employee e=new employee();
e.display();
e.input1();
e.input();
}
}
class person
{
void display()
{
String name;
Scanner in=new Scanner(System.in);
System.out.print("Enter the employee name:");
name=in.nextLine();
}
}
class manager extends person
{
void input()
{
Scanner in=new Scanner(System.in);
String loc;
System.out.print("Enter the employee location:");
loc=in.nextLine();
}
}
class employee extends manager
{
void input1()
{
Scanner in=new Scanner(System.in);
Scanner ins=new Scanner(System.in);
int id;
String des;
int salary;
System.out.print("Enter the employee id:");
id=in.nextInt();
System.out.print("Enter the employee desgination:");
des=ins.nextLine();
System.out.print("Enter the employee salary:");
salary=in.nextInt();
}
}
