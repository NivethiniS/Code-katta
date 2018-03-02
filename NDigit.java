class NDigit

{
public static void main(String arg[])
{

int a=12345;
int b=34;

int value=0;
int value1=0;

while(a!=0)

{
a/= 10;
 ++value;
}

while(b!=0)

{
b/= 10;
 ++value1;
}


System.out.println("the number of digits are.. "+value);
System.out.println("the number of digits are.. "+value1);
}
}
