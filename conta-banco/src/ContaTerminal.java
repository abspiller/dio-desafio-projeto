import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o seu nome");
        String nome = leitura.nextLine();


        System.out.println("Digite sua agência com o dígito");
        String agencia = leitura.nextLine();


        System.out.println("Digite sua conta (Somente números)");
        int conta = leitura.nextInt();


        System.out.println("Digite seu saldo");
        double saldo = leitura.nextDouble();


        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo de R$ " + saldo + " já está disponível para saque.");


    }
}
