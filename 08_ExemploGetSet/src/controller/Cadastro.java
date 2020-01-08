package controller;

import model.Pessoa;

public class Cadastro {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Félix Pascal");
		pessoa.setIdade(53);
		pessoa.setSexo("Masculino");
		
		System.out.println("Nome:"+pessoa.getNome());
		System.out.println("Idade:"+pessoa.getIdade());
		System.out.println("Sexo:"+ pessoa.getSexo());
		// TODO Auto-generated method stub

	}

}
