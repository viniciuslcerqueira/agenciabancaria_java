import java.util.Scanner;
import java.util.Map;

public class BancoMenu {

    public void exibirMenuInicial(){
        System.out.println("Digite o numero de uma das opções abaixo:");
        System.out.println("1 - Criar conta");
        System.out.println("2 - Acessar conta");
    }

    public void exibirMenuContaLogada(Scanner scanner, ContaBancaria conta) {
        int opcao;
        do {
            System.out.println("\n--- Conta Logada ---");
            System.out.println("1 - Visualizar Saldo");
            System.out.println("2 - Sacar Dinheiro");
            System.out.println("3 - Depositar Dinheiro");
            System.out.println("4 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> ServicosBanco.visualizarSaldo(conta);
                case 2 -> ServicosBanco.sacar(conta, scanner);
                case 3 -> ServicosBanco.depositar(conta, scanner);
                case 4 -> System.out.println("Saindo da conta...");
                default -> System.out.println("Opção inválida.");
            }
        } while (opcao != 4);
    }


    //Cadastrar Conta = 1. Ler, Cpf, Nome, Senha, Saldo = 0
    //Instanciar.
    //Salvar no Hashmap.

    public ContaBancaria cadastrarConta(Scanner scanner) {
        System.out.println("----Cadastro de Conta -----");

        System.out.print("Digite o seu CPF: ");
        String cpf = scanner.nextLine();

        if (DBClientes.contas.containsKey(cpf)) {
            System.out.println("Já existe uma conta com esse CPF.");
            return null;
        }

        System.out.print("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua senha: ");
        String senha = scanner.nextLine();

        ContaBancaria novaConta = new ContaBancaria(cpf, nome, senha);
        DBClientes.contas.put(cpf, novaConta);

        System.out.println("Conta criada com sucesso! Logando...");

        return novaConta;

    }

    public ContaBancaria acessarConta(Scanner scanner) {
        System.out.println("---- Acessar Conta ----");

        System.out.print("Digite o CPF: ");
        String cpf = scanner.nextLine();

        Map<String, ContaBancaria> contas = DBClientes.getContas();

        if (!contas.containsKey(cpf)) {
            System.out.println("Conta não encontrada.");
            return null;
        }

        System.out.print("Digite a senha: ");
        String senha = scanner.nextLine();

        ContaBancaria conta = contas.get(cpf);

        if (!conta.getSenha().equals(senha)) {
            System.out.println("Senha incorreta.");
            return null;
        }

        System.out.println("Login bem-sucedido. Bem-vindo, " + conta.getTitular() + "!");
        return conta;
    }

    }


