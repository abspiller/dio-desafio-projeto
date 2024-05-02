import java.util.Scanner;

public class ContaCorrente {

    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int opcao = 0;
        double saldo = 1478.62;


        System.out.println("Digite o seu nome");
        String nome = leitura.nextLine();


        System.out.println("Digite sua agência com o dígito");
        String agencia = leitura.nextLine();


        System.out.println("Digite sua conta (Somente números)");
        int conta = leitura.nextInt();


        System.out.println("\n* * * * * * * Dados do Cliente * * * * * * *");
        System.out.println("Nome: " + nome);
        System.out.println("Número da Conta: " + conta);
        System.out.println("Número da Agência: " + agencia);
        System.out.println("Saldo Atual: R$ " + saldo);
        System.out.println("* * * * * * * * * * * * * * *  * * * * * * *\n");


        do {

            System.out.println("Digite a opção desejada:");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("4. Sair");
            opcao = leitura.nextInt();
            
            if (opcao == 1){
                System.out.println("O saldo atual é: " + saldo);
            }

            if (opcao == 2) {
                System.out.println("Qual o valor do depósito?");
                double deposito = leitura.nextDouble();
                saldo += deposito;
                System.out.println("\nSaldo Atualizado: " + saldo + "\n");
            }

            if (opcao == 3) {
                System.out.println("Qual o valor do saque?");
                double saque = leitura.nextDouble();

                if (saque > saldo) {
                    System.out.println("\nNão há saldo sugficiente par realizar a operação.");
                } else 
                    saldo -= saque;

                System.out.println("\nSaldo Atualizado: " + saldo + "\n");


            }




        } while (opcao != 4);

        System.out.println("Fim do Programa");


    }

}
