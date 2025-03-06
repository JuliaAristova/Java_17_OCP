package chapter_2_operators;
/*
Java automatically promotes from smaller to larger data types.
It will throw compilation error if you try to do opposite without casting.
Casting is a unary operation where one data type is explicitly interpreted as another data type.

 */
public class Casting {

    public static void main(String[] args) {

        //casting is performed by placing the (data type) to the left of the value you want to cast
        int i = (int) 5;
        int hair = (short) 2;
        String type = (String) "Bird";
        short tail = (short) (4 + 10);

        //float egg = 9.0/2;   does not compile
        float egg = 9.0F/2;
        double d = 9.0/2;

        //int tadpole = (int)5 * 2L;
        int tadpole = (int)(5 * 2L);

        //int mammal = 2f;
        int mammal = (int) 2F;

        long goat = 10;
        int sheep = 5;
      //  sheep = goat * sheep;   // simple assignment operator
        sheep *= goat;            //compound assignment operator - first cast sheep to long,
                                 // multiplies, then cast result to int

        System.out.println("Assignment");
        long wolf = 5;
        long coyote = (wolf = 3);
        System.out.println(wolf + " " + coyote);
    }
}
