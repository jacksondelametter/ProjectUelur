/**
 * Created by Jackson on 11/7/2014.
 */
public class Problem9
{
    public static void main(String[] args)
    {
        double c = 1;
        long product = 1L;
        for(int a=1;a<1000;a++)
        {
            for(int b=a+1;b<1000;b++)
            {
                c = (a * a) + (b * b);
                c = Math.sqrt(c);
                if(a + b + c == 1000)
                {
                    System.out.println(a);
                    System.out.println(b);
                    System.out.println(c);
                    product =(long)(a * b * c);
                    System.out.println(product);
                }
            }
        }
    }
}
