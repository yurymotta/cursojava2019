package controller;

public class SobrecargaMetodo {
	int idade;
	String nome;

	// TODO Auto-generated method stub

	public void cadastrarPessoa(int valor) {
		idade = valor;
		System.out.println("Idade:" + idade);

	}

	public void cadastrarPessoa(String valor) {
		nome = valor;
		System.out.println("Nome: " + nome);
	}

	public void cadastrarPessoa(int valor1, String valor2) {
		idade = valor1;
		nome = valor2;
		System.out.println("Idade: " + idade + "- Nome:" + nome);
	}

	public static void main(String[] args) {
		SobrecargaMetodo scm = new SobrecargaMetodo();
		scm.cadastrarPessoa(27);
		scm.cadastrarPessoa("Maria Luiza Magalh�es");
		scm.cadastrarPessoa(41);
		scm.cadastrarPessoa("Marcelo Camelo");

	}

}
