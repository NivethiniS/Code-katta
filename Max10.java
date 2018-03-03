import java.util.Scanner;
 public class Max10 {
 public static void main (String[] args) {

        Scanner input = new Scanner(System.in);

        int total=0;

        int numbers;

        int high;
       int counter=0;

        {

        while (counter < 10){

            numbers = input.nextInt();

            total = total + numbers;

            counter++;

             

        }

        high = total;

        System.out.println("The hightest number entered is "+ high);

        }

    }

}
