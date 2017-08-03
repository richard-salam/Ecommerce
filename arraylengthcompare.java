import java.util.Scanner;
class arraylengthcompare
{
Scanner sc = new Scanner(System.in);
arraylengthcompare()
{
int a1[] ={1,2,3,4,5};
int a2[] ={1,2,3,4,5,6,7,8,9,10};
int ln1=a1.length;
int ln2=a2.length;
if(ln1>ln2)
{
for(int i=0;i<=(ln1-1);i++)
{
System.out.println(a1[i]);
}
}
else
{
for(int i=0;i<=(ln2-1);i++)
{
System.out.println(a2[i]);
}
}
}
public static void main(String[] arg)
{
arraylengthcompare ar= new arraylengthcompare();
}
}
