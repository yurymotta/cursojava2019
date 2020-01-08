package controller;
import util.Teclado;
public class Operadores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Leitura de texto
		String nome;
		nome = Teclado.lerTexto("Insira seu Nome:");

//Leitura de inteiro

		double media;
		double media_minima = 7;
		double resto;

		double av01;
		av01 = Teclado.lerDouble("Digite sua Nota da Av 01: ");

		double av02;
		av02 = Teclado.lerDouble("Digite sua Nota da Av 02: ");

		double av03;
		av03 = Teclado.lerDouble("Digite sua Nota da Av 03: ");

		double av04;
		av04 = Teclado.lerDouble("Digite sua Nota da Av 04: ");

		media = (av01 + av02 + av03 + av04) / 4;

		System.out.println("Sua média é: " + media);

		if (media >= 7) {
			System.out.println("Aprovado");

		} else {
			resto = media_minima - media;
			System.out.println("Reprovado " + media + " Falta: " + resto);
		}
	}
}
