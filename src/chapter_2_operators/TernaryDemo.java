package chapter_2_operators;

public class TernaryDemo {

    public static void main(String[] args) {

        int owl = 5;
        int food;
        food = (owl < 2) ? 3 : 4;
        System.out.println(food);  //4

        System.out.println( (owl < 3) ? 1 : "Small");

        //unperformed side effect
        int sheep = 1;
        int zzz = 1;
        int sleep = (zzz < 10) ? sheep++ : zzz++;
        System.out.println(sheep + ", " + zzz); //2, 1

        sheep = 1;
        zzz = 1;
        sleep = (sheep >= 10) ? sheep++ : zzz++;
        System.out.println(sheep + ", " + zzz); //1, 2

    }
}
