package Exercicios_triangulo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Triangulo equilatero = 3 lados iguais
		// Triangulo Escaleno = 3 lados diferentes
		// Triangulo Isosceles = 2 lados iguais

		Scanner teclado = new Scanner(System.in);
		System.out.println("Digite o primeiro lado:");
		int lado1 = teclado.nextInt();
		System.out.println("Digite o segundo lado:");
		int lado2 = teclado.nextInt();
		System.out.println("Digite o terceiro lado:");
		int lado3 = teclado.nextInt();

		System.out.printf(verificarTriangulo1(lado1, lado3, lado2));
	}

	private static String verificarTriangulo1(int a, int b, int c) {
		int altura = a + b + c;

		if (a == b && a == c && c == b) {
			return "Os 3 lados formam um triangulo Equilátero!\n";

		} else if (a == b || a == c || b == c) {
			return "Os 3 lados formam um triangulo Escaleno!\n";

		} else {
			return "Os 3 lados formam um triangulo Isósceles!\n";
		}
	}
}