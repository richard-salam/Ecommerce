import java.util.Scanner;
class arraycopy
{
Scanner sc = new Scanner(System.in);
arraycopy()
{
int i;
int a1[] ={1,2,6,6,7,4,6,8,9,4,3,4};
int a2[] ={1,2,3,4,5,6,7,8,9,10,5,7};
System.out.println("Array 1 values are:");
for(i=0;i<=((a1.length)-1);i++)
{
System.out.print(a1[i]+" ");
}
System.out.println();
System.out.println("Array 2 values are:");
for(i=0;i<=((a2.length)-1);i++)
{
System.out.print(a2[i]+" ");
}
System.out.println();
System.out.println("After copying array 1 values to array 2:");
for(i=0;i<=((a1.length)-1);i++)
{
a2[i]=a1[i];
}
for(i=0;i<=((a2.length)-1);i++)
{
System.out.print(a2[i]+" ");
}
}
public static void main(String[] arg)
{
arraycopy ar= new arraycopy();
}
}