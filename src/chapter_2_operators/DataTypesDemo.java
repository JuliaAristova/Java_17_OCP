package chapter_2_operators;

public class DataTypesDemo {

    public static void main(String[] args) {

        //Primitive Data Types
        boolean bool = true;
        byte b = 127;
        short s = 32767;  //16-bit; is signed - split between - and +
        int a = 1;
        long l = 9223372036854775807L;
        float f = 3.14f;
        double d = 3.14;
        char c = 'A';    //16-bit; is unsigned - only positive

        short bird = 'd';   //100
        char c2 = 83;       //S
       // c2 = -83;  - compilation error

        System.out.println(c2);
        System.out.println(bird);

        /* does not compile - out of range
        char c3 = (short) -10;
        short reptile = 65535;
        */


        int million1 = 1000000;
        int million2 = 1_000_000;

        /*
        double notAtStart = _1000.00;
        double notAtEnd = 1000.00_;
        double notByDecimal = 1000_.00;
        */
        double annoyingByLegal = 1_00_000.0_0;
        double reallyUgly = 1_______2;



        //Reference Data Type

        //today - reference of type Date
        java.util.Date today;
        String greetings;

        //reference can be assigned to another object of the same or compatible type,
        //or to a new object using new word

        today = new java.util.Date();
        greetings = new String("Hello World");
    }
}
