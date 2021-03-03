import java.util.Scanner;

public class Tema_Session_03_Greeting {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce numele:");
        //String name = null;
        String name = scan.nextLine();

        if (name.isEmpty()) {
            System.out.println("Hello, stranger");
        } else {
            System.out.print("Hello " + name + "!");
        }
    }
}
