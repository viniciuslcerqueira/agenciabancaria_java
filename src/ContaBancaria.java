import java.util.Scanner;

public class ContaBancaria {
    private String cpf;
    private String titular;
    private String senha;
    private double saldo;

    public ContaBancaria(String cpf, String titular,  String senha) {
        this.cpf = cpf;
        this.titular = titular;
        this.senha = senha;
        saldo = 0;
    }

    public String getTitular() {
        return titular;
    }


    public String getCpf() {
        return cpf;
    }

    public String getSenha() {
        return senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}
