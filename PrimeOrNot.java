import java.util.Scanner;
class PrimeOrNot
{
Scanner scan=new Scanner(System.in);
int num=scan.nextInt();
boolean isprime=true;
for(int i=2; i<num; i++)
{
if(num%i==0)
{
isprime=false;
break;
}
}
if(isprime)
{
System.out.println("The number is prime");
}
else
{
System.out.println("The number is nor a prime");
}
}
