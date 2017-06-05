import java.io.*;
import java.util.*;
class fact
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int i,fact=1;
if(n!=0&&n>0)
{
for(i=0;i<=n;i++)
{
fact=fact*i;
}
System.out.println(fact);
}
else
{
System.out.pritnln("not valid number");
}
}
}

