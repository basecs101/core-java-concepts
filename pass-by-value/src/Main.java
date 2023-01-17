public class Main {

    static void swap(String a, String b){
        String temp = a;
        a=b;
        b=temp;

        System.out.println("a = "+a +" b = "+b);

    }
    public static void main(String[] args) {
        String x="X"; //x(reference or pointer) holds address of "X" object
        String y="Y"; //y(reference or pointer) also holds address of "Y" object
        System.out.println("Before swap x = "+x +" y = "+y);
        swap(x,y);//values of x and y pass to swap method
        System.out.println("After swap x = "+x +" y = "+y);
    }
}