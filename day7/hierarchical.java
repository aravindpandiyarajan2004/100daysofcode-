import java.io.*;
import java.util.*;
class hierarchical
{
public static void main(String [] arg)
{ 
System.out.println("****---------------------------------------------------------------------------****");
System.out.println("|                    HIERARCHICAL INHERITANCE                                      |");
System.out.println("****---------------------------------------------------------------------------****");
add a=new add();
a.input();
a.cal1();
subtraction s=new subtraction();
s.input();
s.cal2();
multiplication m=new multiplication();
m.input();
m.cal3();
division d=new division();
d.input();
d.cal4();
}
}
class arithmetic
{
Scanner in=new Scanner(System.in);
int a,b;
public void input()
{
System.out.print("Enter the a value:");
a=in.nextInt();
System.out.print("Enter the b value:");
b=in.nextInt();
}
};
class add extends arithmetic
{
int c;
public void cal1()
{
c=a+b;
System.out.println("Sum = "+c);
System.out.println();
}
};
class subtraction extends arithmetic
{
int d;
public void cal2()
{
d=a-b;
System.out.println("Subtraction = "+d);
System.out.println();
}
};
class multiplication extends arithmetic
{
int e;
public void cal3()
{
e=a*b;
System.out.println("Multiplication ="+e);
System.out.println();
}
};
class division extends arithmetic
{ 
int f;
public void cal4()
{
f=a/b;
System.out.println("Division = "+f);
System.out.println();
}
};

