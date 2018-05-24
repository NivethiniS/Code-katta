import java.util.Scanner;
class Main
{
public static void main(String arg[])
{
Scanner input=new Scanner(System.in);
char ch=input.next().charAt(0);
if(ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || 
			ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U')
{
System.out.println("Yes");
}
else
{
System.out.println("no");
}
}
}
