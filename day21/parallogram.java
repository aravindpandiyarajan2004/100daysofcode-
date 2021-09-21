import java.io.*;
import java.util.*;
class parallogram //main class
{
public static void main(String [] args)
{
sub s=new sub();
s.show();
}
}
class parent //parent class
{
void area()
{
int base=50;
int height=10;
int parallogram=base*height;
System.out.print("The parallogram area is="+parallogram);
System.out.println();
}
}
class sub extends parent //child class
{
void area()
{
int base=25;
int height=5;
int parallogram=base*height;
System.out.print("The parallogram area is="+parallogram);
}
void show()
{
super.area();
area();
}
}
