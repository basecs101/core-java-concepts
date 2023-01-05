public class OuterClassExample {

    String outerMsg;

    InnerClass innerClass;

    private class InnerClass{
        String msg;

        public InnerClass(String msg) {
            this.msg = msg;
        }
    }

    void printObject(){

    }

    public static void main(String[] args) {
        OuterClassExample outerClassExample = new OuterClassExample();

        outerClassExample.outerMsg ="Hello From Outer class";

        OuterClassExample.InnerClass innerObject = outerClassExample.new InnerClass(
                "Hello from inner class");
    }
}
