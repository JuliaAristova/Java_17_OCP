package chapter_2_operators;

public class VariablesDemo {

    String name;
    static int version;
    //var varInClass = 100; // does not compile

    public static void main(String[] args) {

        int x, y;
        int a, b = 3;
       // int c, var d = 4; - does not compile

      //  var x;   does not compile - declaration + initialization
        var v1 = 10;   //local variable type inference

       // var v2 = 1, v3 = 2; - does not compile

        var v4 = "Cannot be initialized to null without a type";
        v4 = null;
        var v5 = 10;
        // v5 = null;  - does not compile - primitive

        var v6 = (String) null;

        var apples = (short) 10;

        System.out.println("");
    }

    private void reassignment(){
        var number = 7;
        number = 4;
//        number = "ten";   //does not compile
    }
}
