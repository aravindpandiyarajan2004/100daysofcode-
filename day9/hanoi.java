import java.io.*;
import java.util.*;
class hanoi
{
static void tower(int n,char from, char to,char aux)
{
if(n==1)
{
System.out.println("Move disk 1 from peg " + from + " to peg " + to);
return;
}
tower(n-1,from,aux,to);
System.out.println("Move disk " + n + " from peg "+ from + " to peg " + to);
tower(n-1,aux,to,from);
}
public static void main(String [] args)
{
Scanner in=new Scanner(System.in);
int n;
System.out.print("Enter the number of disks:");
n=in.nextInt();
tower(n,'A','C','B');
}
}

