public class Power2
{
   public int largestPowerOf2 (int n)
   {
        int res = 2;        
        while (res < n) {
                res =(int)Math.pow(res, 2);
        }

        return res;
   }
}
