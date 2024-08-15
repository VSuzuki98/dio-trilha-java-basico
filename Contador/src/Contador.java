import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o primeiro número desejado: ");
        int valor_1 = scanner.nextInt();

        System.out.println("Digite o segundo número desejado: ");
        int valor_2 = scanner.nextInt();

        try {
            contar(valor_1, valor_2);

        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo valor deve ser maior que o primeiro valor!");
        }
    }

    static void contar(int valor_1, int valor_2) throws ParametrosInvalidosException{
        
        int contagem = valor_2 - valor_1;
        if(contagem < 0){
            throw new ParametrosInvalidosException();
        }else{
            for(int i = valor_1; i <= valor_2; i++){
                System.out.println(i);
            }
        }
    }
}
