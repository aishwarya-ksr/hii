import java.io.*;
import java.util.*;
class index
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
Arrays.sort(a);
for(int i=0;i<n;i++)
{
if(a[i]==i)
{
System.out.print(a[i]);
}
else
System.out.print("not equal");
}
}}
