import java.util.Scanner;

class Maximum10
{
public static void main(String argn[]){
Scanner data = new Scanner(System.in);
int num, i, temp, max;
System.out.print("Enter number :");
num = data.nextInt();
System.out.println("Enter " +num+ " number");
max = data.nextInt();
for (i=1; i < 10; i++) { temp = data.nextInt();
 if(temp < max)
continue;
else
max = temp;
}
System.out.println("Largest Number is "+max);
}
}
