import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        String nome;
        double Sal, V, SalF;


        Scanner ler = new Scanner(System.in);

        System.out.println("Nome do vendedor: ");
        nome = ler.nextLine();
        System.out.println("Salario fixo: ");
        Sal = ler.nextDouble();
        System.out.println("Numero de vendas: ");
        V = ler.nextDouble();

        SalF = (V * 0.15) + Sal;

        System.out.println("Vendedor: " + nome);
        System.out.println("SalF: " + SalF);

    }
}