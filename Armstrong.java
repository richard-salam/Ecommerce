import java.util.Scanner;
class Armstrong
{
int r=1,i,num,count=0;
Scanner sc = new Scanner(System.in);
public Armstrong()
{
System.out.println("Enter a number:");
num = sc.nextInt();
while(num/10!=0 || num%10 !=0)
{
count++;
r=num%10;
num=num/10;
}
while(num/10!=0 || num%10 !=0)
{
r=num%10;
for(i=1;i<=count;i++)
{
r*=r;
System.out.println(r);
}
num=num/10;

}
}
public static void main(String[] arg)
{
Armstrong pobj = new Armstrong();
}
}