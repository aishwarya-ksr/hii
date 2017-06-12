import java.util.*;
import java.io.*;
import java.util.Arrays;
class Unique
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int a[]=new int[n];
int i;
int value=0;
for(i=0;i<a.length;i++)
{
a[i]=sc.nextInt();
value=value^a[i];
}
System.out.println(value);
}
}


