import java.util.Locale;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        String escolha;
        int i;

        Scanner ler = new Scanner(System.in);


        for (i=0; i>0; i++)
        {
            System.out.println("N. Novo arquivo");
            System.out.println("A. Novo arquivo");
            System.out.println("F. fechar arquivo");
            System.out.println("S. Sair");
            escolha = ler.nextLine().toUpperCase(Locale.ROOT);
            if (escolha.equals("N"))
            {
                System.out.println("Novo arquivo criado com sucesso");
                i = 0;
            }

            else
                if (escolha.equals("A")) {
                    System.out.println("Abrindo arquivo");
                    i = 0;
                }
                else
                    if (escolha.equals("F")) {
                        System.out.println("Arquivo fechado com sucesso");
                        i = 0;
                    }
                    else
                        if (escolha.equals("S")){
                            System.out.println("Saindo");
                            i = 1;
                        }
                        else {
                            System.out.println("Valor incorreto");
                        }
        }
    }
}