package Recuperación;

import java.util.Scanner;

public class CalcularAños {
	public static void main(String[] args) {
		Scanner t = new Scanner(System.in);
		int numerodias, years, meses, dias;
		do {
			System.out.println("Introduce el número de días a convertir (valores mayores de 0)");
			numerodias = t.nextInt();
		} while (numerodias <= 0);
		years = (int) numerodias / 365;
		meses = (int) (numerodias % 365) / 30;
		dias = (numerodias % 365) % 30;
		System.out.println("El " + numerodias + " corresponde a " + years + " a " + meses + " m " + dias + " d.");
		System.out.println("Gracias por utilizar mi programa");
		t.close();
	}
}