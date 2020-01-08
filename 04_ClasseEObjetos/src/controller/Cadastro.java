package controller;

import model.Carro;

public class Cadastro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Carro carro01 = new Carro();
carro01.modelo = "Uno";
carro01.fabricante = "FIAT";
carro01.cor = "Cinza";
carro01.ano = 1997;


Carro carro02 = new Carro();
carro02.modelo = "Fusca";
carro02.fabricante = "Volkswagen";
carro02.cor = "Verde";
carro02.ano = 1971;

Carro carro03 = new Carro();
carro03.modelo = "Opala";
carro03.fabricante = "Chevrolet";
carro03.cor = "Preto";
carro03.ano = 1988;

Carro carro04 = new Carro();
carro04.modelo = "Corcel";
carro04.fabricante = "Ford";
carro04.cor = "Azul";
carro04.ano = 1969;

System.out.println ("Modelo:"+carro01.modelo);
System.out.println ("Modelo:"+carro02.cor);
System.out.println ("Modelo:"+carro03.ano);
System.out.println ("Modelo:"+carro04.fabricante);

}

}
