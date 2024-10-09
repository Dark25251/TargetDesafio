import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Onde o usuario digita o numero
        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();
        scanner.nextLine();

        int a = 0;  // Primeiro número de fibo
        int b = 1;  // Segundo número de fibo

        // Verifica se o número digitado é 0 ou 1, que são os dois primeiros da sequência de fibo
        if (numero == 0 || numero == 1) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
            return;
        }

        int soma = a + b;  // Próximo número da sequência

        // looping do fibo
        while (soma < numero) {
            a = b;          // Atualiza o valor de 'a' para o valor de 'b'
            b = soma;       // Atualiza o valor de 'b' para o valor de 'soma'
            soma = a + b;   // Calcula o próximo número da sequência
        }

        // Verificar se o número pertence à sequência de fibo
        if (soma == numero) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " NÃO pertence à sequência de Fibonacci.");
        }

        scanner.close(); 
    }
}
