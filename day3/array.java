import java.io.*;
public class array
{
public static void main(String [] arg)
{
int[] arr=new int[4];
arr[0]=10;
arr[1]=20;
arr[2]=30;
arr[3]=40;
int sum=0;
int i;
int lengthofArray=arr.length;
for(i=0;i<lengthofArray;i++)
{
sum=sum+arr[i];
}
System.out.println("The sum is: "+ sum);
}
}


