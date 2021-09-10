import java.io.*;
import java.util.*;
class arraytranspose
{
public static void main(String [] args)
{
int[][] arr={{2,4,5},{6,7,8},{1,3,9}};
int[][] t=new int[3][3];
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
t[i][j]=arr[j][i];
}
}
System.out.println("output:");
for(int i=0;i<3;i++)
{
for(int j=0;j<3;j++)
{
System.out.print(t[i][j] + " ");
}
System.out.println();
}
}
}

