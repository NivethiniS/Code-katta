import java.util.Scanner;
public class Main
{
public static void main(String arg[])
{
Scanner sc=new Scanner(System.in);
int number=sc.nextInt();

while (number > 0) {
    System.out.println( number % 10);
    number = number / 10;

if(number%2==1)
{
    System.out.println("yes");
}
}
}
}
