import java.util.*;
import java.io.*;
class duplicate
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String s=sc.nextLine();
String ans="";
char c;
int j,i=0;
j=s.length();
s+=" ";
c=s.charAt(0);
while(i<j)
{
ans=ans+c;
while(s.charAt(++i)==c&&i<j)
{}
c=s.charAt(i);
}
System.out.println(ans);
}
}
