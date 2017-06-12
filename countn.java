import java.io.*;
import java.util.*;
class countn
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int count=0;
int m;
while(n>0)
{
m=n%10;
count++;
n=n/10;
}
System.out.println(count);
}
}
