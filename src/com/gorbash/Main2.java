package com.gorbash;

import java.math.BigInteger;

/**
 * Created by Gorbash on 2014-11-11.
 */
public class Main2 {

    static class FibbonaciGenerator {

        private BigInteger n_1;
        private BigInteger n_2;


        public BigInteger next() {
            if (n_1 == null) {
                n_1 = BigInteger.ONE;
                return n_1;
            } else if (n_2 == null) {
                n_2 = BigInteger.ONE;
                return n_2;
            }
            BigInteger ret = n_1.add(n_2);
            n_2 = n_1;
            n_1 = ret;
            return ret;
        }
    }

    public static void main(String[] args) {
        FibbonaciGenerator gen = new FibbonaciGenerator();
        BigInteger sum = new BigInteger("0");
        for (int i = 0; i < 42000; i++) {
            sum = sum.add(gen.next());
        }
        System.out.println("sum:" + sum);
    }
}
