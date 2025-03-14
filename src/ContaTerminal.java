import java.util.Scanner;

public class ContaTerminal {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    //Construtor
    public ContaTerminal(int numero, String agencia, String nomeCliente, double saldo) {   
        this.numero = numero;
        this.nomeCliente = nomeCliente;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    //Getters e Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }    

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente(){
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

// Exibindo detalhes da conta
    public void exibirDetalhes() {
    System.out.println("Olá! " + nomeCliente + " obrigado por criar uma conta no nosso banco, sua agência é " + agencia + " conta " + numero + " e seu saldo " + saldo + " já está disponível para saque! 21");
    }

// Criando o Scanner / método principal
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 

// Capturando os dados do cliente
        System.out.println("Por favor, digite o número da sua conta aqui: ");
        int numero = sc.nextInt(); 
        sc.nextLine();

        System.out.println("Por favor, digite seu nome de usuário aqui: ");
        String nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o número da sua agência aqui: ");
        String agencia = sc.nextLine();

        System.out.println("Digite o saldo da conta: ");
        double saldo = sc.nextDouble();


// Criando objeto da conta
        ContaTerminal contaTerminal = new ContaTerminal(numero, agencia, nomeCliente, saldo);

// Exibindo detalhes
        contaTerminal.exibirDetalhes();

        sc.close();
    }
}