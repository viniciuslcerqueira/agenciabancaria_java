public class ContaBancaria {
    private String titular;
    private String cpf;
    private int senha;
    private double saldo;

    public ContaBancaria(String titular, String cpf, int senha) {
        this.titular = titular;
        this.cpf = cpf;
        this.senha = senha;
        saldo = 0;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
