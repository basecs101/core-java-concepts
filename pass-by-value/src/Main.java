public class Main {

    static void swap(String a, String b) {
        String temp = a;
        a=b;
        b=temp;

        System.out.println("a = "+a.hashCode() +" b = "+b.hashCode());

    }
    public static void main(String[] args) {
        String x="P"; //x(reference or pointer) holds address of "X" object
        String y="Q"; //y(reference or pointer) also holds address of "Y" object
        System.out.println("Before swap x = "+x.hashCode() +" y = "+y.hashCode());
        swap(x,y);//values of x and y pass to swap method
        System.out.println("After swap x = "+x.hashCode() +" y = "+y.hashCode());
    }
}