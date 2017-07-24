import java.io.*;
import java.util.*;
class exist
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int sum=0;
int a[]=new int[n];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
int x=sc.nextInt();
for(int i=0;i<n;i++)
{
for(int j=i+1;j<n;j++)
{
sum=a[i]+a[j];
if(sum==x)
{
System.out.print(a[i]+a[j]);
}
}
}
}
}
