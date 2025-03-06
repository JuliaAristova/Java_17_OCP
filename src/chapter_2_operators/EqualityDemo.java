package chapter_2_operators;

import java.io.File;

/*
primitive - relational operators ==, !-
Objects:
- two objects are the same
- two objects are equivalent
 */
public class EqualityDemo {

    public static void main(String[] args) {

        boolean monkey = true == false;
      //  monkey = true ==  -- cannot mix the types
        System.out.println(monkey);

        boolean bear = false;
        boolean polar = (bear = true);
        System.out.println(polar);  //true

        /*
        == applies to the references to the objects,
        Two references are equal if they both POINT to the same OBJECT or NULL
         */
        var Monday = new File("example.txt");
        var Tuesday = new File("example.txt");
        var Wednesday = Monday;
        System.out.println(Monday == Tuesday);   //false
        System.out.println(Monday == Wednesday); //true

    }
}
