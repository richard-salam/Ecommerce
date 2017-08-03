import java.util.Scanner;
class factorial
{
Scanner sc = new Scanner(System.in);
factorial()
{
int num,fact=1;
System.out.println("Enter a number: ");
num = sc.nextInt();
for(int i=num;i>=1;i--)
{
fact= fact*i;
}
System.out.println("Factorial of "+num+" : "+fact);
}
public static void main(String[] arg)
{
factorial fo=new factorial();
}
}