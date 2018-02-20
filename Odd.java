class Odd
{
int a=20;
int ans; 
void dsplay()
{
ans=a%2;
if(ans=1)
{
System.out.println("this is Odd number");
}
else
{
System.out.println("this is Even number");
}
}
public static void main(String arg[])
{
Odd oo=new Odd();
oo.display();
}
}
