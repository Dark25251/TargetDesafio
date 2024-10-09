import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Solicita que o usuC!rio digite a frase/string
		System.out.print("Digite uma frase: ");
		String frase = scanner.nextLine();

		int contador = 0;

		// Verifica cada caractere
		for (int i = 0; i < frase.length(); i++) {
			char letra = frase.charAt(i); // retorna o caractere na posiC'C#o i dentro da string

			// Verifica se o caractere C) 'a' ou 'A'
			if (letra == 'a' || letra == 'A') {
				contador++;
			}
		}


		System.out.println("A letra 'a' aparece " + contador + " vezes na frase.");

		scanner.close();
	}
}