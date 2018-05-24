import java.util.Scanner;
class Main
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
long n1=sc.nextInt();
long n2=sc.nextInt();
long n3=2^32;
if(n1<=n3 && n2<=n3)
{
long t=n1-n2;
System.out.println(t);
}
}
}

