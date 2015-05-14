package com.wei.samples.lang;

/**
 * Created by wei on 15/5/14.
 */
public class Math {
    /**
     * 平方根倒数速算法
     * read more:
     * {@link http://zh.wikipedia.org/wiki/平方根倒数速算法}
     *
     * @param x
     * @return
     */
    public static float fastSqrt(float x) {
        float hx = x * 0.5f;
        int ix;
        float r;

        // make initial guess
        ix = Float.floatToRawIntBits(x);
        ix = 0x5f3759df - (ix >> 1);
        r = Float.intBitsToFloat(ix);

        // do some number of newton-ralphson steps,
        // each doubles the number of accurate
        // binary digits.
        r = r * (1.5f - hx * r * r);
        r = r * (1.5f - hx * r * r);
        //进行多次迭代
        r  = r*(1.5f-hx*r*r);
        //r  = r*(1.5f-hx*r*r);

        //return r;    // 1/sqrt(x)
        return r * x;  // sqrt(x)
    }
}
