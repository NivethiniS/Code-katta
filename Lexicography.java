import java.util.Scanner;
class Main
{
public static void main(String arg[])
Scanner sc=new Scanner(System.in);
int num=sc.nextInt();
while(n>0)
{
int s=num%10;
num=num/10;
s=s*10+num;
}
System.out.println(s);
}
