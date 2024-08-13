import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        /* Instanciando o objeto 'scanner' que lerá os valores inputados pelo usuário*/
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("1 - Digite o numero de sua conta: ");
        int numero = scanner.nextInt();

        System.out.println("2 - Digite o nome de sua agência: ");
        String agencia = scanner.next();

        System.out.println("3 - Digite o seu nome: ");
        String cliente = scanner.next();

        System.out.println("4 - Digite o valor do saldo: ");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá, " + cliente + "! Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque!");
    }

}

