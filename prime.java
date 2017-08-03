import java.util.Scanner;
class prime
{
Scanner sc = new Scanner(System.in);
public prime()
{
int i,num,count1=0;
System.out.println("Enter a number:");
num = sc.nextInt();
for(i=2;i<num;i++)
{
if(num%i == 0)
{
count1++;
}
}
if(count1==0)
{
System.out.println(num+" is prime number");
}
else
{
System.out.println(num+" is not a prime number");
}
}
public static void main(String[] arg)
{
prime pobj = new prime();
}
}