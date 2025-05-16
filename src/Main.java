import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Opções de entrada:
        System.out.println("-----Bem vindo a VBank-----");
        System.out.println("Digite o numero de uma das opções abaixo:");
        System.out.println("1 - Criar conta");
        System.out.println("2 - Acessar conta");

        int opcaoEscolhida = scanner.nextInt();

        //Validação das Opções de entrada:
        if (opcaoEscolhida != 1 || opcaoEscolhida != 2) {
            System.out.println("Opção Invalida, tente novamente");
        }








        //TODO Criar classe ContaBancaria
        //Todo Criar validaçao de acesso
        //TODO criar


    }
}