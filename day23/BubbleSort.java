import java.io.*;
import java.util.*;
class BubbleSort
{
public static void main(String [] args)
{
System.out.println("****------------------BUBBLE SORT-------------------****");
Scanner in=new Scanner(System.in);
System.out.println("How many elements you want to be sort:");
int n=in.nextInt();
int[] a =new int[n];
System.out.println("Enter the element:");
for(int i=0;i<n;i++)
{
a[i]=in.nextInt();
}
for(int i=0;i<n-1;i++)
{
for(int j=0;j<n-1-i;j++)
{
if(a[j]>a[j+1])
{
int temp=a[j];
a[j]=a[j+1];
a[j+1]=temp;
}
}
}
System.out.println("-----------------------------");
System.out.println("The Sorted Array:");
for(int x:a)
{
System.out.println(x);
}
System.out.print("The given elements are succuessfully sorted!");
}
}