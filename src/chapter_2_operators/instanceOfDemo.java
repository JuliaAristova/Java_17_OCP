package chapter_2_operators;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class instanceOfDemo {

    public static void main(String[] args) {
        Integer zooTime = Integer.valueOf(9); //only one object is created
        Number number = zooTime;
        Object object = zooTime;

        //because Integer inherits from Number and Object - 2 below are true
        System.out.println(zooTime instanceof Integer);  //true
        System.out.println(number instanceof Number);    //true
        System.out.println(zooTime instanceof Object);   //true

        //calling a method which has Number as a parameter
       openZoo(11);        //Integer --> 11 O'clock
       openZoo(10.5);      //double --> 10.5
        openZoo(9F);

        System.out.println("instanceof NULL always returns false");
        System.out.println(null instanceof Object); //false
        Object noObject = null;
        System.out.println(noObject instanceof Object);
      //  System.out.println(null instanceof null);  does not compile
    };

    private static void openZoo(Number time){
        if (time instanceof Integer) {
            System.out.println((Integer) time + " O'clock");
        }
     //   else if (time instanceof String) {} does not compile - Number cannot hold Strings
        else if (time instanceof Double) {
            System.out.println("It is " + (Double) time);
        }
        else {
            System.out.println(time);
        }
    }
}
