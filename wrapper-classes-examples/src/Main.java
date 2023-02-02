public class Main {
    public static void main(String[] args) {
        /*
         boolean -> Boolean
         byte -> Byte
         char -> Character
         short -> Short
         int -> Integer
         float -> Float
         long -> Long
         double -> Double
         */
        int x = 20;
        Integer z = Integer.valueOf(x); // primitive int to Wrapper Integer
        Integer y= 20;//primitive int getting converted to Wrapper Integer automatically. -->Auto-Boxing

        Integer a =100;
        int b = a.intValue();// Wrapper Integer to primitive int.
        int c = a;//Wrapper Integer getting converted to primitive int automatically. -->Auto-Un-Boxing

    }
}