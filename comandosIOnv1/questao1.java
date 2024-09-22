import java.util.*;


class Main {
	public static void main(String[] args) {
		Scanner saldo = new Scanner(System.in);
		System.out.println("Entre valor saldo:");
		double valor = saldo.nextFloat();
		System.out.println("acrescimo 1% " + valor*1.01);
	}
}
