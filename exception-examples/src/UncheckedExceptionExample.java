
public class UncheckedExceptionExample {
    public static void main(String[] args) {
        try{
            printArray();
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
            System.out.println("Array Index is out of bounds");
        } catch (RuntimeException runtimeException){
            System.out.println("RuntimeException exception occurred");
        } finally {
            System.out.println("Finally block always gets executed.");
        }

    }

//    static void printArray(){
//        try {
//            String arr[] = new String[]{"Vikram", "Pratik","Saurabh"};
//
//            for (int i = 0; i < arr.length; i++) {
//                System.out.println(arr[i]);
//            }
//            System.out.println(arr[3]);
//        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException){
//            System.out.println("Array Index is out of bounds");
//        }
//    }

    static void printArray() throws ArrayIndexOutOfBoundsException, RuntimeException {
        String arr[] = new String[]{"Vikram", "Pratik", "Saurabh"};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(arr[3]);
    }
}
