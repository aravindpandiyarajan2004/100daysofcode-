import java.util.*;
class merge
{
public static void main(String [] args)
{
System.out.println("****--------------MERGE SORT--------------****");
Scanner in=new Scanner(System.in);
System.out.print("How many elements you want to sort:");
int n=in.nextInt();
int[] a= new int[n];
System.out.println("Enter array elements:");
for(int i=0;i<n;i++)
{
a[i]=in.nextInt();
}
msort(a,0,a.length-1);
System.out.println("sorted array:");
for(int x:a)
{
System.out.println(x);
}
}
private static void msort(int[] a,int i,int j)
{
if(i<j)
{
int mid=(i+j)/2;
msort(a,i,mid);
msort(a,mid+1,j);
merge(a,i,mid,j);
}
}
private static void merge(int[] a,int l,int mid,int r)
{
int i=l;
int j=mid+1;
int k=l;
int[] b=new int[a.length];
while(i<=mid && j<=r)
{
if(a[i]<a[j])
{
b[k]=a[i];
i++;
k++;
}
else
{
b[k]=a[j];
j++;
k++;
}
}
while(i<=mid)
{
b[k]=a[i];
i++;
k++;
}
while(j<=r)
{
b[k]=a[j];
j++;
k++;
}
for(i=l;i<=r;i++)
{
a[i]=b[i];
}
}
}