package ec;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hora;

		System.out.println("quantas horas");
		hora = sc.nextInt();
		if (hora < 12) {
			System.out.println("Bom Dia!");
		} else if (hora < 18) {
			System.out.println("Boa tarde");
		} else {
			System.out.println("Boa Noite");
		}

		sc.close();
	}

}
