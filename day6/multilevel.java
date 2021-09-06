import java.io.*;
import java.util.*;
class multilevel
{
public static void main(String [] args)
{
result a=new result();
a.input();
a.output();
a.cal();
a.calresult();
}
}
class student
{
int rno;
int m1,m2,m3;
String name;
Scanner in=new Scanner(System.in);
public void input()
{
System.out.println("****------------------------------------------STUDENT MARKS SLIP---------------------------------------------------****");
System.out.print("Enter the student Name:");
name=in.nextLine();
System.out.print("Enter Register Number:");
rno=in.nextInt();
System.out.println("Enter Three marks M1,M2 and M3 :");
m1=in.nextInt();
m2=in.nextInt();
m3=in.nextInt();
System.out.println("--------------------------------------------------------------");
}
public void output()
{ 
System.out.print("The student Name is "+name);
System.out.println();
System.out.print("The Register Number is "+rno);
System.out.println();
System.out.print("M1 Mark is "+ m1 );
System.out.println();
System.out.print("M2 Mark is "+m2);
System.out.println();
System.out.println("M3 Mark is "+m3);
System.out.println("------------------------------------------------------------");
}
};
class mark extends student
{
float t,av;
public void cal()
{
t=m1+m2+m3;
av=t/3;
System.out.println("Total="+t);
System.out.println("Average="+av);
}
};
class result extends mark
{
String re,cl;
public void calresult()
{
if(m1>35 && m2>35 && m3>35)
{
 re="Pass";
if(av>80)
 cl="First";
else if(av>60)
 cl="Second";
else
 cl="Third";
}
else
re="Fail";
System.out.println("Result="+re);
System.out.println("Class="+cl);
System.out.println("****------------------------------------------------GOOD MARKS-------------------------------------------------****");
}
};



