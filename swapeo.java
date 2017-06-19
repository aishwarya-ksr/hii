import java.io.*;
import java.util.*;
class swapeo
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.next();
char ch[]=s.toCharArray();
char temp;
for(int i=0;i<ch.length;i=i+2)
{

temp=ch[i];
ch[i]=ch[i+1];
ch[i+1]=temp;
}
System.out.println(ch);
}
}
