package util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Teclado {

String teclado;

private static BufferedReader teclado_01 =
new BufferedReader(
new InputStreamReader(System.in));

public static String lerTexto(String texto) {
try {
//Mostra o texto
System.out.println(texto);

//Lê a linha
return teclado_01.readLine();

}   catch (IOException e) {
return null;
}

}