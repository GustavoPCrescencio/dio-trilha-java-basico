
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        //Definição de tipos de variáveis

        String agencia, nomeCliente;
        double saldo;
        int numero;

        // Obter pelo scanner os valores digitados pelo usuário

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Por favor, digite o número da Agência! ");
        numero = Integer.parseInt(scanner.nextLine());

        System.out.println("Por favor, digite o nome da Agência! ");
        agencia = scanner.nextLine();
        
        System.out.println("Por favor, digite o seu nome! ");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o seu saldo! ");
        saldo = scanner.nextDouble();

        scanner.close();

        // Mensagem Final para o usuário com os dados digitados por ele

        System.out.println("Olá, " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
