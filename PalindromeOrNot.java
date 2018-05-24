import java.util.Scanner;
class Main
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
System.out.println(num);
int rem,palin=0;
while(n<0)
{
rem=num%10;
num=num/10;
palin=palin*10+rem;
if(palin==num)
{
System.out.println("yes");
}
else
{
System.out.println("no");
}
}
}
}
