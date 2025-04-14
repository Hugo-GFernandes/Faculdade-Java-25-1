import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        String escolha;
        int i;

        Scanner ler = new Scanner(System.in);


        for (i=0; i>0; i++)
        {
            System.out.println
                    ("Digite N para novo arquivo, A para abrir arquivo, " +
                            "F para fechar arquivo e S para sair");
            escolha = ler.nextLine();
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