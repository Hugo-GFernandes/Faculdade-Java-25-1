import java.util.Scanner;
public class Aula_3_ex_1 {
    public static void main(String[] args) {

        String nome;
        float nota1, nota2, nota3, media;



        Scanner ler = new Scanner(System.in);
        System.out.println("Digite seu nome: ");

        nome = ler.nextLine();
        System.out.println("Primeira nota: ");
        nota1 = ler.nextFloat();
        System.out.println("Segunda nota: ");
        nota2 = ler.nextFloat();
        System.out.println("Terceira nota: ");
        nota3 = ler.nextFloat();


        media = (nota1 + nota2 + nota3)/3;
        System.out.println("A media de " + nome + " é: " + media);




         {


        }
    }
}