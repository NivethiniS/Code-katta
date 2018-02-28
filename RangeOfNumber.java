class RangeOfNumber
{
int a;
RangeOfNumber(int num)
{
a=num;
}
void show()
{
if(a<11)
{
System.out.println("The number A is"+a);
}
else
{
System.out.println("The number is greater than 10");
}
}
public static void main(String arg[])
{
RangeOfNumber ran=new RangeOfNumber(4);
ran.show();
RangeOfNumber range=new RangeOfNumber(40);
range.show();
}
}
