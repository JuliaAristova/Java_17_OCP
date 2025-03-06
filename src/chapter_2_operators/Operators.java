package chapter_2_operators;
/*
OPERATORS PRECEDENCE
Post-unary operators: x++, x--
Pre-unary operators: ++x, --x
Other unary: ~ , !, -, +, (type)
Cast: (Type) reference
----BINARY-------
*, /, %
+ ,  -
Shift operators: <<, >>, >>>
Relational: >, >=, <, <=, instanceof
==, !=
Logical AND  &
Logical OR  ^
Logical inclusive OR |
Conditional AND     &&
Conditional OR      ||
Ternary operator  ? :
Assignment operator: =, !=, *=, /= etc.
Arrow operator: ->

 */

public class Operators {

    public static void main(String[] args) {

        int a = 1;
        int b = 2;
        System.out.println(5 + -1 + a++ - --b); //5 -1 + 1 - 1 = 4

        int cookies = 4;
        double reward = 3 + 2 * --cookies; //9.0
        System.out.println(reward);

        //UNARY OPERATORS - required one operans
        /*
        logical complement  !a
        Bitwise complement ~b   - converts 01 to int
        plus +a                 positive number
        negation/minus -q       negative
        Increment ++a, a++
        Decrement --a, a--
        =
         */
        boolean isAnimalAsleep = false;
        System.out.println(isAnimalAsleep);  //false
        isAnimalAsleep = !isAnimalAsleep;
        System.out.println(isAnimalAsleep);  //true

        //bitwise applies only to int
        //Multiply by -1 and subtract 1
        System.out.println("Bitwise complement operator ~");
        int value = 3;              //stored as 0011
        int complement = ~value;   //stored as 1100    (-1) * 3 - 1
        System.out.println(value + " " + complement);  //3 -4

        System.out.println("Negation operator");
        double zooTemperature = 1.21;
        System.out.println(zooTemperature);  //1.21

        zooTemperature = -zooTemperature;
        System.out.println(zooTemperature);  //-1.21

        zooTemperature = -(-zooTemperature); //-(-(-1.21))
        System.out.println(zooTemperature);  //-1,21

      /* Does not compile
        boolean peacock = 0;
        boolean boo = -true;
        boolean pelican = !5;
    */

        System.out.println("Increment & Decrement operator");
        int x = 5;
        System.out.println(x++ + ++x);  // 5 + 7 = 12
        System.out.println(x);          //7

        //BINARY OPERATORS - take two operands
        // + , - , *, /, % - may be applied to any java primitives with the exception of boolean
        //+ can be applied to String - String concatenation

        System.out.println(9 % 2);  //1
        /*
        1 mod 2 is a situation where the divisor, 2, is larger than the dividend, 1,
        so the remainder you get is equal to the dividend, 1.
        ==> a % b == a if b> a
         */
        System.out.println(2 % 3);  //2
        System.out.println(4.89 % 2);
    }

}
