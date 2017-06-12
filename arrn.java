import java.io.*;
import java.util.*;
class arrn
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
int i,j;
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
int n1=sc.nextInt();
for(i=0;i<n;i++)
{
for(j=i+1;j<n;j++)
{
if(a[i]+a[j]==n1)
{
System.out.println(a[i]+""+a[j]);
}
}
}
}
}



