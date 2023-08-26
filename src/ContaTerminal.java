import java.util.Scanner;

public class ContaTerminal {
	

		public static void main(String[]args) {
			int numero;
			String agencia = null,nomeCliente= null;
			double saldo;
			
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Por favor digite o número da conta !");
			numero = scan.nextInt();
			scan.nextLine();
		System.out.println("Por favor  digite o numero da agencia");
			agencia= scan.nextLine();
			
		System.out.println("Por favor digite o nome do cliente : ");
			nomeCliente = scan.nextLine();
			
		System.out.println("Por favor digite o saldo :");
			saldo = scan.nextDouble();
		
		
		System.out.println("Ola " + nomeCliente + ", obrigado por criar uma conta em nosso banco"
				+ " sua agencia é "+ agencia + " conta numero " + numero + " e seu saldo "+
				saldo + " ja esta disponivel para saque !");
		
		}
}
