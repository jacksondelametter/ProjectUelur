import java.math.BigInteger;

/**
 * Created by macuser on 12/5/14.
 */
public class Problem10
{
   public static void main(String[] args)
   {
       int number = 10;
       BigInteger sum = new BigInteger("2");
       for(int i=3;i<number;i+=2)
       {
           if(isPrime(i))
           {
               System.out.println(i);
               sum = sum.add(BigInteger.valueOf(i));
           }
       }
       System.out.println(sum);
   }
    public static boolean isPrime(int number)
    {
        boolean primeOrNot = false;
        for(int i=2;i<=number;i++)
        {
            if(number%i==0)
            {
                primeOrNot = false;
                break;
            }
            else
            {
                primeOrNot = true;
            }
        }
        return primeOrNot;
    }
}
