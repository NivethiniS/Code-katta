public class Max {


    public static void main (String[] args) 
    {
        int i;
        int large[]=new int[5];     
        int array[] = {33,55,13,46,87,42,10,34,43,56};
        int max = array[0];

        
        for(  i = 1; i < array.length; i++) 
        {
           
            if( max < array[i])
            {
              
                max = array[i];
                large[i] = max;
            }
        }
        for (int j = 0; j<5; j++)
        {
            System.out.println("Largest 5 : "+large[j]);
        }
        System.out.println("Largest is: "+ max);
      
    }

}
