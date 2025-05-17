import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        BancoMenu menu = new BancoMenu();
        int opcaoMenu1;


        System.out.println("-----Bem vindo a VBank-----");

        //Validação das Opções de entrada:
        do {
            menu.exibirMenuInicial();
            opcaoMenu1 = scanner.nextInt();

            if (opcaoMenu1 != 1 && opcaoMenu1 != 2) {
                System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcaoMenu1 != 1 && opcaoMenu1 != 2);

        //Opcão de entrada
        //1. Cadastrar, 2- Acessar conta.
















    }
}