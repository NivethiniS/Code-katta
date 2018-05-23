import java.util.Scanner;
class Main
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int n= sc.nextInt();
System.out.println(n);
while(n!=1)
{
n=n/2;
n++;
}
for(i=0;i<n+1;i++)
{
int x=1;
int p=2;
x=x*p;
}
System.out.println("The nearest greater power of 2 is"+x);
}
}
}
