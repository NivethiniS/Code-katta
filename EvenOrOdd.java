import java.util.Scanner;
class EvenOrOdd
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n1=sc.nextInt();
int n2=sc.nextInt();
int diff=n1-n2;
if(diff%2==0)
{
System.out.println("yes");
}
else
{
System.out.println("no");
}
}
}
