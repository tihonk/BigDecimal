import java.math.BigDecimal;

public class App
{
    public static void main(String[] args)
    {
        BigDecimal a = new BigDecimal(0.0);
        while (a.doubleValue()!=1 )
        {
            a =BigDecimal.valueOf(a.doubleValue()  + 0.1).setScale(1, BigDecimal.ROUND_HALF_EVEN);
            System.out.println(a);
        }
    }
}
