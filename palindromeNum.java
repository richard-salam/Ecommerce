import java.util.Scanner;
class palindromeNum
{
Scanner sc = new Scanner(System.in);
public palindromeNum()
{
int num,rev=0,r;
System.out.println("Enter a number:");
num = sc.nextInt();
int chk=num;
do
{
r=num%10;
rev= rev*10+r;
num=num/10;
}while(num/10!=0 || num%10 !=0);
if(chk == rev)
{
System.out.println(chk+" is palindrome");
}
else
{
System.out.println(chk+" is not palindrome");
}
}
public static void main(String[] arg)
{
palindromeNum pobj = new palindromeNum();
}
}