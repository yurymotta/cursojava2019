package controller;
import util.Teclado;
public class LacoVariavelControle {
	public static void main(String[] args) {
	int r,x,i;
	i=1;
	do {
		x = Teclado.lerInt("Digite um n�mero:");
				r = x*3;
		System.out.println(r);
		i=i+1;
		}while (i<=5);
	}

}
