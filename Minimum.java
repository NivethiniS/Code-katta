import.util.java.*;
class Minimum
{
   public static void main(String args[])
   {
      int x, y, z;
      System.out.println("Enter three integers ");
      Scanner largest = new Scanner(System.in);
 
      x = largest.nextInt();
      y = largest.nextInt();
      z = largest.nextInt();
 
      if ( x < y && x < z )
         System.out.println("First number is smallest.");
      else if ( y <x && y < z )
         System.out.println("Second number is smallest.");
      else if ( z< x && z < y )
         System.out.println("Third number is smallest.");
      else   
         System.out.println("Entered numbers are not distinct.");
   }
}
