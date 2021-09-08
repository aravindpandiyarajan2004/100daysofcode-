import java.io.*;
import java.util.*;
class funover
{
public static void main(String [] args)
{
fun f=new fun();
f.avg(8,10);
f.avg(10.9,8.4);
f.avg(908,809);
}
}
class fun
{
void avg(int a,int b)
{
int z=(a+b)/2;
System.out.println("Average ="+z);
}
void avg(float a,float b)
{
float z=(a+b)/2;
System.out.println("Average ="+z);
}
void avg(double a,double b)
{
double z=(a+b)/2;
System.out.println("Average ="+z);
}
}


