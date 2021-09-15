package eng;
import java.util.*;
public class Engineering
{
String dep,name,college;
double reg;
Scanner in=new Scanner(System.in);
Scanner ins=new Scanner(System.in);
public void input()
{
System.out.println("---------------------------TODAY SPECIAL------------------------------");
System.out.print("Enter the college name:");
college=in.nextLine();
System.out.print("Enter the name:");
name=in.nextLine();
System.out.print("Enter the register number:");
reg=ins.nextDouble();
System.out.print("Enter the department:");
dep=in.nextLine();
System.out.print("------------------------HAPPY ENGINEERING'S DAY--------------------------");
}
}
