import java.math.BigInteger;

import static java.lang.Long.MAX_VALUE;

public class Class {
    public static void main(String[] args) {
        long g = MAX_VALUE;
        BigInteger b = BigInteger.valueOf(g);
        BigInteger summ = b.multiply(b);
        System.out.println(summ);
    }
}
