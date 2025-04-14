import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


    int    A, B, InvA, InvB;


        Scanner ler = new Scanner(System.in);


        System.out.println("Digite o valor de " +
                "A: ");
        A = ler.nextInt();
        System.out.println("Digite o valor de B: ");
        B = ler.nextInt();

        InvA = B;
        InvB = A;

        System.out.println("O valor invertido de A: " + B );
        System.out.println("O valor invertido de B: " + A );






    }
}