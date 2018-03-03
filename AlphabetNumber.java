import java.util.Scanner;
class AlphabetNumber
{
char ch;
Scanner sc=new Scanner(Syatem.in);
System.out.println("Entea a Character: ");
ch = sc.next().charAt(0);
if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
{
System.out.println(ch+" is Character ");
}
else
{
System.out.println(ch+" is a number");
}
}
