import java.util.Scanner;
class Main
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
if(n%1==0)
{
System.out.println(i);
}
}
}
}
