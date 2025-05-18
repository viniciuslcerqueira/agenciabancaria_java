import java.util.Scanner;

public class ServicosBanco {
    //TODO deposito, transferencia, login, saque
    public static void visualizarSaldo(ContaBancaria contaBancaria) {
        System.out.println(contaBancaria.getSaldo());

    }

    public static void sacar(ContaBancaria contaBancaria, Scanner scanner) {
        System.out.println("Digite o valor que você quer sacar:");
        double valorSaque = scanner.nextDouble();
        scanner.nextLine();

        if (valorSaque < 0) {
            System.out.println("Valor Invalido");
        } else if (valorSaque > contaBancaria.getSaldo()) {
            System.out.println("Saldo insuficiente");
        } else {
            contaBancaria.setSaldo(contaBancaria.getSaldo() - valorSaque);
            System.out.println("Saque realizado com sucesso");
        }

    }

    public static void depositar(ContaBancaria contaBancaria, Scanner scanner) {
        System.out.println("Digite o valor que voce quer depositar: ");
        String input = scanner.nextLine();

        try {
            double valorDeposito =  Double.parseDouble(input.replace(",", "."));

            if (valorDeposito <= 0) {
                System.out.println("Valor Invalido");
            } else {
                contaBancaria.setSaldo(contaBancaria.getSaldo() + valorDeposito);
                System.out.println("Saque realizado com sucesso");
            }
        } catch (NumberFormatException e) {
            System.out.println("Entrada inválida. Digite um numero valido.");
        }


    }


}




