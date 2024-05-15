import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(": ");
        int numero = sc.nextInt();
        System.out.println("Serie 1: ");
        serie1(numero);
        System.out.println("Serie 1: ");
        serie2(numero);
        System.out.println("Serie 1: ");
        serie3(numero);


    }

    private static void serie1(int serie) {
        for (int i = 1; i <= serie; i++) {
            if (i %2 !=0){
                System.out.print("*");
            }    else {
                System.out.print(".");
            }
        }
        System.out.println();
    }

    private static void serie2(int serie) {
        int imprimir = 1;
        for (int i = 1; i <= serie; i++) {
            System.out.print(imprimir);
            imprimir ++;
            if (imprimir >4) {
                imprimir= 1;
            }
        }
        System.out.println();
    }

    private static void serie3(int serie) {
        for (int i = 1; i <= serie; i++) {
            if (i %3 !=0){
                System.out.print("|");
            }    else {
                System.out.print("*");
            }
        }
        System.out.println();
    }
}