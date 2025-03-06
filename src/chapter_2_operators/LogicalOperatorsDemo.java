package chapter_2_operators;

/*
Logical AND             a & b   is only true if both operands are true
Logical Inclusive OR    a | b   is false if both operands are false
Logical Exclusive OR    a ^ b   is only true if the operands are different

NOTE:
&& - if the left side is false, then the right side will not be evaluated
|| - if the lase side is true, then the tight side will not be evaluated
 */
public class LogicalOperatorsDemo {

    public static void main(String[] args) {

        boolean a = true;
        boolean b = false;
        boolean c = true;
        boolean d = false;

        System.out.println("& and &&");

        System.out.println(a & b);          //false
        System.out.println(a && b);         //false
        System.out.println(a & c);          // true
        System.out.println(a && c);         //true

        System.out.println("| and ||");
        System.out.println(a | b);          //true
        System.out.println(a || b);         //true
        System.out.println(b | d);          //false
        System.out.println(b || d);         //false

        System.out.println("^");
        System.out.println(a ^ b);         //true
        System.out.println(a ^ c);         //false
        System.out.println(b ^ d);         //false

        System.out.println("Conditional && and ||");
        int x = 3;
        int y = 4;
        boolean b1 = true || (y < x++);
        System.out.println(b1);        //true
        //unperformed side effect - x++ is not executed
        System.out.println(x);         //3

        System.out.println(false && (y < x++));  //false
        System.out.println(x);                  //3

        boolean b2 = true | (y< x++);
        System.out.println(b2);        //true
        System.out.println(x);         //4

        System.out.println(false & (y < x++)); //false
        System.out.println(x);            //5

    }
}
