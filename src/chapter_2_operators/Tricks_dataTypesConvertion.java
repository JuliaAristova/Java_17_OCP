package chapter_2_operators;

public class Tricks_dataTypesConvertion {

    public static void main(String[] args) {

        int pig = (short) 4;
        pig = pig++;
        long goat = (int)2;
        goat -= 1.0;
        System.out.println(pig + " " + goat); //4 - 1

        //**********************

        short height = 1, weight = 3;
       // short zebra = (byte) weight * (byte) height;
        int zebra = (byte) weight * (byte) height;

        //**********************
      //  int note = 1 * 2 + (long)3;
        int note = 1 * 2 + 3;
        short melody = (byte)(double)(note *= 2);// int -> double -> byte -----> short is OK
        double song = melody;
        float symphone = (float) ((song == 1_000) ? song * 2L : song);

        //*******************

        int ticketsTaken = 1;
        int ticketsSold = 3;
        ticketsSold += 1 + ticketsTaken++;
        ticketsTaken *= 2;
    //    ticketsSold = ticketsSold + (long)1; does not compile
        ticketsSold += (long) 1;
        //compound operator automatically casts the right-hand operand

        System.out.println("ticketsTaken = " + ticketsTaken);
        System.out.println("ticketsSold " + ticketsSold);

        //*******************
        int start = 7;
        int end = 4;
        end += ++start;
        start = (byte)(Byte.MAX_VALUE + 1); //128 - out of range

        System.out.println("start " + start);     //-128
        System.out.println("end " + end);         //12

        //*******************

        int myFavouriteNumber = 8;
        int bird = ~myFavouriteNumber;    //-9
        int plane = -myFavouriteNumber;   //-8
        /*
        System.out.println("myFavouriteNumber = " + myFavouriteNumber);
        System.out.println("bird = " + bird);
        System.out.println("plane = " + plane);
*/
        var superman = bird == plane ? 5 : 10; //10

        System.out.println(bird + ", " + plane + ", " + --superman); //-9, -8, 10

        }
}
