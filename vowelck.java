import java.util.Scanner;
class vowelck
{
Scanner sc = new Scanner(System.in);
vowelck()
{
System.out.println("Enter a Charecter: ");
char s = sc.next().charAt(0);
if(s=='a'||s=='e'||s=='i'||s=='o'||s=='u'||s=='A'||s=='E'||s=='I'||s=='O'||s=='U')
{
System.out.println(s+" is a vowel.");
}
else{System.out.println(s+" is not a vowel.");}
}
public static void main(String[] arg)
{vowelck vo=new vowelck();}
}