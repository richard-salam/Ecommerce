class pattern1
{
pulic void numTriangle()
{
for(int i=1;i<=5;i++)
{
for(int j=1;j<=5;j++)
{
System.out.println(j+" ");
}
System.out.println();
}
}
public static void main(String[] arg)
{
pattern1 tobj = new pattern1();
tobj.numTriangle();
}
}
