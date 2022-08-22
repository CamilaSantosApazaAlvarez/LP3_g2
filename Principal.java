import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int vida, rp = 0;
		boolean f1 = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Numero? ");
		vida = sc.nextInt();
		System.out.println("Numero ingresado: " + vida);
	
		for (int i=1; i <= vida; i++)
			rp += i;
		System.out.println("La suma es: " + rp);
	}
}
