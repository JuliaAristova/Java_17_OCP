package chapter_2_operators;

/*
1 - if 2 values are different type, Java automatically promotes one of the value to
the larger of the two data types
2 - If one value is integral, second - floating-point, then integral value is promoted to floating-point
3 - byte, short, char automatically promoted to int any time they are with binary operator
4- after they promoted, the result is promoted to the same data type
 */
public class NumericPromotion {

    public static void main(String[] args) {

        int i = 1;
        long l = 5;
       // int r1  = i + l;
        long r_l = i + l;  //rule 1

        long l2 = 5;
        double dd = 5.0;
        double rd = l2 + dd; //rule 2

        double d = 39.21;
        float f = 2.1f;
        int i2 = 1;
        double r_d= d + f;
        float r_f = f + i2;

        short s = 10;
        short s2 = 30;
        int r3 = s + s2;
       // short r_s = s + s2; - rule 3, 4

        short s3 = 4;
        float f2 = 3;
        double d2 = 2;
        double r4 = s3 * f2 / d2;

        //rule 4
        byte apples = 5;
        short oranges = 10;
        int bananas =apples + oranges;
        long bananas2 =apples + oranges;
        double bananas3 =apples + oranges;
    }
}
