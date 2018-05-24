import java.util.Scanner;
class Main
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=2;i<n-2;i++)
{
if(n%i==0)
{
System.out.println("Composite");
}
else
{
System.out.println("notaComposite");
}
}
}
}
}
