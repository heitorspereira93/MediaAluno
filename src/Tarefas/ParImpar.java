package Tarefas;

import java.util.Scanner;

public class ParImpar {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int numero = scanner.nextInt();

		if (numero % 2 == 0) {
			System.out.println("O número é par");
		} else {
			System.out.println("O número é impar ");

		}
	}
}