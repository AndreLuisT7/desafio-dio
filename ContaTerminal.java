import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        String agencia = "";
        String nomeCliente = "";
        double saldo = 0;

        System.out.println("Por favor insira o Nº de usuario");
        numero = sc.nextInt();

        System.out.println(numero + " Por favor insira a agencia");
        agencia = sc.next();

        System.out.println(numero + " Qual o seu nome");
        nomeCliente = sc.next();

        System.out.println(numero + " Por favor informe o valor de deposito!");
        saldo = sc.nextDouble();


        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + " conta " + numero + " e seu saldo "
                + saldo + " já está disponível para saque\".");
        sc.close();
    }
}