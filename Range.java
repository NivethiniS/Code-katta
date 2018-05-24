import java.util.Scanner;
class Main
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int l=sc.nextInt();
int r=sc.nextInt();
int n=sc.nextInt();
if (n >= l && n <= r)
{
System.out.println("Yes");
}
else
{
System.out.println("no");
}
}
}
