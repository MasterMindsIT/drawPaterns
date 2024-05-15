import java.util.Scanner;

public class PatronesAnidados {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese N: ");
        int numero = sc.nextInt();
        System.out.println("Serie 1:");
        serie1(numero);
        System.out.println("Serie 2:");
        serie2(numero);
        System.out.println("Serie 3:");
        serie3(numero);
        System.out.println("Serie 4:");
        serie4(numero);

    }

    private static void serie1(int serie) {
        for (int i = 1; i <= serie; i++) {
            for (int j = 1; j <= serie ; j++) {
                if (i == serie || i == 1) {
                    System.out.print("*");
                } else if (j==1 || j==serie){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }

    private static void serie2(int serie) {
        System.out.println("Patron n2: ");
        for (int i = 1; i <= serie; i++) {
            for (int j = 1; j <= serie ; j++) {
                if (i == serie || i == 1) {
                    System.out.print("*");
                } else if (j== serie-i+1 ){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }

    private static void serie3(int serie) {
        System.out.println("Patron n3: ");
        for (int i = 1; i <= serie; i++) {
            for (int j = 1; j <= serie; j++) {
                if (j == serie - i + 1 || j == i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
    private static void serie4(int serie) {
        System.out.println("Patron n4: ");
        for (int i = 1; i <= serie; i++) {
            for (int j = 1; j <= serie ; j++) {
                if (i==1) {
                    if (j<serie) {
                            System.out.print("*");
                        }else{
                        System.out.print(" ");
                    }
                }else if (i== serie) {
                        if (j==1){
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }
                }else if (j==1 || j==serie){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
