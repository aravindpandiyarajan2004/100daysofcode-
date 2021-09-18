package cube;
import java.util.*;
public class cubic
{
int n;
Scanner in=new Scanner(System.in);
public void input()
{
System.out.print("Enter the values of n:");
n=in.nextInt();
float cube=n*n*n;
System.out.print("The cube of " + n + " is:"+cube);
}
}