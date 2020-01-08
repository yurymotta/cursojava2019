package Controller;

import model.Usuario;

public class Cadastro {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usuario user = new Usuario();
		user.nome = "Felipe Cardoso";
		user.endereco = "Professor Gabizo, 109";
		user.idade = 28;
		System.out.println(user.nome);
		System.out.println(user.endereco);
		System.out.println(user.idade);
	}

}