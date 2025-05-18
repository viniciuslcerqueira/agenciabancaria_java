import java.util.Scanner;


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
            scanner.nextLine();

            if (opcaoMenu1 != 1 && opcaoMenu1 != 2) {
                System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcaoMenu1 != 1 && opcaoMenu1 != 2);

        //Opcão de entrada
        //1. Cadastrar, 2- Acessar conta.

        ContaBancaria contaLogada = null;

        if (opcaoMenu1 == 1) {
            contaLogada = menu.cadastrarConta(scanner);
        } else if (opcaoMenu1 == 2) {
            contaLogada = menu.acessarConta(scanner);
        }



// Se uma conta foi retornada com sucesso:
        if (contaLogada != null) {
            menu.exibirMenuContaLogada();
        }


        //






















    }
}