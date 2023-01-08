import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedExceptionExample {
    public static void main(String[] args) {
//        try{
//            readFromAFile();
//        } catch (FileNotFoundException fileNotFoundException){
//            System.out.println("File not found exception occurred");
//        }
        readFromAFile();
    }

    static void readFromAFile() {

        File file = new File("C:\\Users\\Shree\\IdeaProjects\\core-java-concepts\\exception-examples\\src\\ErrorExample1.java");

        Scanner scanner = null;
        try {

            scanner = new Scanner(file);
            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }

        }catch (FileNotFoundException fileNotFoundException){
            System.out.println("File is not present");
        } finally{
            scanner.close();
        }
    }

//    static void readFromAFile() throws FileNotFoundException{
//
//        Scanner scanner;
//        File file = new File("C:\\Users\\Shree\\IdeaProjects\\core-java-concepts\\exception-examples\\src\\ErrorExample1.java");
//
//        scanner = new Scanner(file);
//        while (scanner.hasNext()) {
//            System.out.println(scanner.nextLine());
//        }
//    }
}
