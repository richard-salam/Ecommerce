import java.util.*;
class stringrev
{
Scanner sc=new Scanner(System.in);
stringrev()
{
System.out.println("Enter a string: ");
String s= sc.next();
int lnth=s.length();
StringBuilder str = new StringBuilder(lnth);
for(int i=(lnth-1);i>=0;i--)
{
str.append(s.charAt(i));
}
System.out.println("Reversed String is: "+str.toString());
}
public static void main(String[] arf)
{
stringrev sng = new stringrev();
}
}
