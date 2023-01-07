public class ErrorExample {

    static int count = 0;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main called " + count);
        Thread.sleep(5);
        count++;
        main(new String[]{});
    }
}
