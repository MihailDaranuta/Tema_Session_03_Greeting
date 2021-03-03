import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Introduce numarul a:");
        int a = s.nextInt();
        System.out.println("Introduce numarul b:");
        int b = s.nextInt();

        int sum=a+b;
        int dif=a-b;
        int prod=a*b;
        double imp = a * 1.0 / b;

        System.out.println("Suma numerelor este = " + sum);
        System.out.println("Diferenta numerelor este = " + dif);
        System.out.println("Produsul numerelor este = " + prod);
        System.out.println("Impartirea numerelor este = " + imp);

    }
}
