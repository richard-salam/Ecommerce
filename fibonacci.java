class fibonacci
{
public fibonacci()
{
int a=0,b=1;
while((a+b)<=200)
{
System.out.println(a=a+b);
b=a-b;
}
}
public static void main(String arg[])
{
fibonacci fib = new fibonacci();
}
}