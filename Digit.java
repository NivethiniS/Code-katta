class Digit

{
public static void main(String arg[])
{

int a=12345;

int value=0;

while(a!=0)

{
a/= 10;
 ++value;
}

System.out.println("the number of digits are.. "+value);
}
}
