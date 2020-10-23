import java.math.BigInteger;
 
public class x
{
    public static void main( String[] args ) {
        System.out.print(Factorial(25));
    }
 
    public static String Factorial(int n) {
        if(n < 0){
            return null;
        }
        if(n == 0 || n == 1){
            return "1";
        }
        BigInteger product = BigInteger.ONE;
        for(int i = 2; i <= n; i++){
            product = product.multiply(new BigInteger(String.valueOf(i)));
        }
        return product.toString();
    }
 
}