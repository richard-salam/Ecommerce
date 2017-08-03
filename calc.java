import java.util.Scanner;
class calc
{
Scanner sc= new Scanner(System.in);
calc()
{
System.out.println("Enter Two numbers: ");
int n1= sc.nextInt();
int n2= sc.nextInt();
System.out.println("Enter the operator + - * /");
char ch=sc.next().charAt(0);
switch (ch)
{
case '+' :
System.out.println("The Sum is: "+(n1+n2));break;
case '-' :
System.out.println("The Difference is: "+(n1-n2));break;
case '*' :
System.out.println("The product is: "+(n1*n2));break;
case '/' :
System.out.println("The Quotient is: "+(n1/n2));break;
default :
System.out.println("Invalid Entery!");
}
}
public static void main(String[] arg)
{
calc c= new calc();}
}